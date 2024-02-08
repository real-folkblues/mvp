'use client'

import React, { useState } from 'react';
import Image from 'next/image';
import Button from './api/components/Button/button.jsx';
import Link from 'next/link';


// `app/page.tsx` is the UI for the `/` URL
export default function Page() {
  const handleClick = () => {
    console.log("Click happened");
  };
  return (
    <div>
      <h1>Welcome to the Liftoff Project Demo!</h1>
      <Link href="/api/client/">
      <Button onClick={handleClick}>Take me to form</Button>
  </Link>


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
