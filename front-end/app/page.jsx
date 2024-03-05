'use client'

import { useState } from 'react';
import Image from 'next/image';
import Button from './components/Button/button.jsx';
import Link from 'next/link';
import React from 'react';




// `app/page.tsx` is the UI for the `/` URL
export default function Home() {

  const [password, setPassword] = useState("");
  const [isPasswordValid, setIsPasswordValid] = useState(false);
  const [email, setEmail] = useState("");
  const [isEmailValid, setIsEmailValid] = useState(false)

  const login = () => {
    console.log("Handle login and registration")
  }

  const {inputs, handleInputChange, handleSubmit} = useForm(login);
  
  return (
    <div className='flex flex-col gap-[10px] bg-[white] p-[15px] rounded-[10px]'>
      <h2>Welcome to the Liftoff Project Demo!</h2>

      <h1 className='text-center text-[35] max-w-[150px] font-bold text-[#5f4dfc] leading-[39px]'>Create your account</h1>
      <form className='flex flex-col gap-[10px]'>

        <input type='email' placeholder='email' value={email} onChange={handleChangeE}
        className={' ${isEmailValid} ?'}/>



        <input type='password' placeholder='password' value={password} onChange={handleChangeP}
        className={' ${isPasswordValid} ?'}
        />

<Link href="/login/">
        {/* <button className='mt-[25px] bg-slate-500] h-[38px] rounded-[40px] text-[white] cursor-pointer' type=submit></button> */}
      <Button onClick={handleClick}>Create account</Button>
  </Link>

      </form>
      
  <p>Powered by</p>
      <Image
        src="/vercel.svg"
        alt="Vercel Logo"
        width={72}
        height={16}
      />
  </div>
  )
}
