'use client'

import Link from 'next/link';
import React from 'react';
import




// `app/page.tsx` is the UI for the `/` URL
export default function CreateLogin() {

  const logUrl = "http://localhost:8080/login"

 const [password, setPassword] = useState("");
  const [isPasswordValid, setIsPasswordValid] = useState(false);
  const [email, setEmail] = useState("");
  const [isEmailValid, setIsEmailValid] = useState(false)

  const handleChangeP = (e) =>
  {
    e.preventDefault();
    setPassword(e.target.value);
    setIsPasswordValid(e.target.value.length > 6);
  }

const handleChangeE = (e) =>
  {
    e.preventDefault();
    setEmail(e.target.value);
    setIsEmailValid(e.target.value.includes("@"));
  }

  const handleChangeP = (e) =>
  {
    e.preventDefault();
    setPassword(e.target.value);
    setIsPasswordValid(e.target.value.length > 6);
  }

const handleChangeE = (e) =>
  {
    e.preventDefault();
    setEmail(e.target.value);
    setIsEmailValid(e.target.value.includes("@"));
  }

}

  
