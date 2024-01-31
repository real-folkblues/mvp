import React from 'react';

export async function getServerSideProps(context) {
  // Fetch data from external API
  const res = await fetch(`https://.../data`);
  const data = await res.json();

  // Pass data to the page via props
  return { props: { data } };
}

export default function Home({ data }) {
  // Render data...

  return (
    <div>
      <h1>My Data</h1>
      {/* Render data here */}
    </div>
  );
}