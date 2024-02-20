import type { Config } from "tailwindcss";

const config: Config = {
  content: [
    "./pages/**/*.{html,js,ts,jsx,tsx,mdx}",
    "./components/**/*.{html,js,ts,jsx,tsx,mdx}",
    "./app/**/*.{html,js,ts,jsx,tsx,mdx}",
  ],
  theme: {
    screens: {
      xl: '1440px',
    },
    colors: {
      'pink': '#ff49db',
    },
    fontFamily: {
      sans: ['Graphik', 'sans-serif'],
      serif: ['Merriweather', 'serif'],
    },
    extend: {
      spacing: {
        '128': '32rem',
        '144': '36rem',
      },
      borderRadius: {
        '4xl': '2rem',
      }
    },
  },
  plugins: [],

  
};


export default config;
