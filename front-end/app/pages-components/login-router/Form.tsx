"use client";

import * as css from "@/app/css";
import useSession from "./use-session";
import { defaultSession } from "./lib";
import { useRouter, usePathname, useSearchParams } from 'next/navigation';

export function Form() {
  const { session, isLoading } = useSession();

  if (isLoading) {
    return <p className="text-lg">Loading...</p>;
  }

  if (session.isLoggedIn) {
    return (
      <>
        <p className="text-lg">
          Logged in user: <strong>{session.username}</strong>
        </p>
        <LogoutButton />
      </>
    );
  }

  return <LoginForm />;
}

function LoginForm() {
  const { login } = useSession();
  const router = useRouter(); //router hook
  const pathname = usePathname();
  const searchParams = useSearchParams();

  return (
    <form
      onSubmit={async function (event) {
        event.preventDefault();
        const formData = new FormData(event.currentTarget);
        const username = formData.get("username") as string;
        const password = formData.get("password") as string;
        const result = await login(username); 
        if (result.isLoggedIn) {
          router.push('/user-profile');
         } // Redirect on successful login
      }}
      method="POST"
      className={css.form}
    >
      <label className="block text-lg">
        <span className={css.label}>Username</span>
        <input
          type="text"
          name="username"
          className={css.input}
          placeholder=""
          defaultValue="Alison"
          required
          // for demo purposes, disabling autocomplete 1password here
          autoComplete="off"
          // data-1p-ignore
        />
      </label>
      <label className="block text-lg"> {/* Add this block for password */}
        <span className={css.label}>Password</span>
        <input
          type="password"
          name="password"
          className={css.input}
          required
          autoComplete="off"
        />
      </label>
      <div>
        <input type="submit" value="Login" className={css.button} />
      </div>
    </form>
  );
}

function LogoutButton() {
  const { logout } = useSession();

  return (
    <p>
      <a
        className={css.button}
        onClick={(event) => {
          event.preventDefault();
          logout(null, {
            optimisticData: defaultSession,
          });
        }}
      >
        Logout
      </a>
    </p>
  );
}