// import React from 'react';



// export default function ApiPage ({ data }) {
//   // Render the data
//   return (
//     <div>
//       <h1>Data from API:</h1>
//       <pre>{JSON.stringify(data, null, 2)}</pre>
//     </div>
//   );
// }

// export async function getServerSideProps() {
//   // Fetch data from API
//   const response = await fetch('http://localhost:8888/kanjis');
//   const data = await response.json();

//   // Pass data to the page via props
//   return { props: { data } };
// }