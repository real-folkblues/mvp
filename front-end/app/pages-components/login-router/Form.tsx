"use client";

import './loginFormStyles.css'; // Adjust the path as necessary

import useSession from "./use-session";
import { defaultSession } from "./lib";
import { useRouter } from 'next/navigation';

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
 

  return (
    
    <div className="">
    <form
      onSubmit={async function (event) {
        event.preventDefault();
        const formData = new FormData(event.currentTarget);
        const username = formData.get("username") as string;
        
        const result = await login(username); 
        if (result.isLoggedIn) {
          router.push('/user-profile');
         } // Redirect on successful login
      }}
      method="POST">
        <div className="input-box">
          <input type="text" placeholder='Username' required />
        </div>
      
        <div className="input-box">
          <input type="text" placeholder='Password' required />
        </div>
      
      <div className='button'>
        <input type="submit" value="Login" className='button' />
      </div>
    </form>
    </div>
  );
}

function LogoutButton() {
  const { logout } = useSession();

  return (
    <p>
      <a
        className='button'
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