"use client";

import './loginFormStyles.css'; // Adjust the path as necessary

import useSession from "./use-session";
import { defaultSession } from "./lib";
import { useRouter } from 'next/navigation';


export function Form() {
  // const { session, isLoading } = useSession();

  // if (isLoading) {
  //   return <p className="text-lg">Loading...</p>;
  // }

  // if (session.isLoggedIn) {
  //   return (
  //     <>
  //       <p className="text-lg">
  //         Logged in user: <strong>{session.username}</strong>
  //       </p>
  //       <LogoutButton />
  //     </>
  //   );
  // }

  return <LoginForm />;
}

const LoginForm: React.FC = () => {
  const { login } = useSession();
  const router = useRouter();

  const handleSubmit = async (event: React.FormEvent<HTMLFormElement>) => {
    event.preventDefault();
    const formData = new FormData(event.currentTarget);
    const username = formData.get("username") as string;
    const password = formData.get("password") as string;
    // Assuming login function returns a promise and result has an isLoggedIn property
    const result = await login(username, password); // Make sure login accepts password as well
    if (result.isLoggedIn) {
      router.push('/user-profile'); // Redirect on successful login
    }
  };

  return (
    <div className='wrapper'>
      <form onSubmit={handleSubmit} method="POST">
        <h1>Login</h1>
        <div className="input-box">
          <input name="username" type="text" placeholder='Username' required />
          
        </div>
        <div className="input-box">
          <input name="password" type="password" placeholder='Password' required />
          
        </div>

        {/* <div className="remember-forgot">
          <label><input type="checkbox" />Remember me</label>
          <a href="#">Forgot password?</a>
        </div> */}

        <button type="submit">Login</button>

        {/* <div className="register-link">
          <p>Don't have an account? <a href="#">Register</a></p>
        </div> */}
      </form>
    </div>
  );
};

export default LoginForm;

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