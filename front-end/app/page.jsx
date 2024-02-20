'use client'
import styles from './main.module.css';
import Image from 'next/image';
import Button from './components/Button/button.jsx';
import Link from 'next/link';


// `app/page.tsx` is the UI for the `/` URL
export default function Home() {
   const handleClick = () => {
    console.log("Click happened");
  };
  return (
    <main className='flex min-h-screen flex-col items-center p-24'>
    <h1 className='text-4xl font-bold'>Search and Save Kanji</h1>
    
    <p className={styles.h2}>
  <Link href="/client/">
      <Button onClick={handleClick}>Take me to form</Button>
  </Link>
</p>

    <p className={'font-bold text-blue-800 text-base ${styles[text-scale]}'}>Powered by</p>
    <Image
      src="/vercel.svg"
      alt="Vercel Logo"
      width={72}
      height={16}
      line-height={2}
    />
    <p>

    </p>
    </main>
  )
}