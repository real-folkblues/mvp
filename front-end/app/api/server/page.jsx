// import { Client } from "../components/Client"
// import React, { useState } from 'react';

// export default async function Server(){
//     const podcasts = await fetch("https://PodcastAPI.com")
//     .then(res => res.json())
//     .then(data => [json])
// }
//     console.log("server")

    
// //input values
// const podSearch = (props) => {
  
//   const [name, setName] = useState('');
//   const [genre, setGenre] = useState('');
//   const [network, setNetwork] = useState('');

//    //manage output values
//   const [matchingName, setMatchingName] = useState(null);
  
//   // manage error message
//   const [errorMessage, setErrorMessage] = useState('');

//   //this post handler takes an abv, searches the api with it. then takes the keyword and searches the description of each beer returned
//   const webUrl = "http://localhost:8080/api/server"; 

//   const handleSubmit = async (event) => {
//     event.preventDefault();

//     const data = {
//       name: event.target.name.value,
//       genre: event.target.genre.value,
//       network: event.target.network.value,
//       };

//       console.log(data);

//     try {
//       const response = await fetch(webUrl, {
//         method: 'POST',
//         headers: {
//           'Content-Type': 'application/json',
//         },
//         body: JSON.stringify(data),
//       });

//       if (!response.ok) {
//         // checking if response status is not OK (as in a 4-- or 5-- response status code)
//         throw new Error(`Eva error goes here`);
//       }

//       console.log(data);  
        
//       const responseData = await response.json()
//     //   .then(responseData => {
//     //     props.setBeers(responseData);
//     //   })
//       console.log(responseData);
//       setMatchingName(responseData); 
        
//     //   //reset input field and error message
//     //   setTaste('');
//     //   setAbv('');
//     //   setErrorMessage('');

//       //handle error
//     } catch (error) {
//       setErrorMessage(error.message);
//       console.error('Eva error: ', error);
//     }
//   };


//     return (
//         <><>
//             <h1>Server Page, API fetch</h1></><ul>{ podcasts.map( todo => (
//                 <li key={ .name }>{ todo.genre }</li> ) ) }</ul><Client /></>)
            

    
//             }

// pages/index.js

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