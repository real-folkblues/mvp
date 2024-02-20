import { Inter } from 'next/font/google'

// import Header from './components/NavBar'

const inter = Inter({ subsets: ['latin'] })

export const metadata = {
  title: 'Lift Off app',
  description: 'My first MVP',
}

export default function RootLayout({ children }) {
  return (
    <html lang="en">
      <body className={inter.className}>
        {/* <Container> */}
        {/* <Header /> */}
        {children}
        {/* <Footer /> */}
        {/* </Container>  */}
      </body>
    </html>
  )
}