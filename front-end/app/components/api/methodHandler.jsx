import React from 'react';
const url = 'http://localhost:8080;'

export const handleSave = async (kanjiData) => {
  try {
    const response = await fetch(url, { // Change this URL to your actual backend endpoint
      method: 'POST',
      headers: {
        'Content-Type': 'application/json',
      },
      body: JSON.stringify({kanjiData})
    })
    })
.then(response => {
    if (!response.ok) {
      throw new Error('Failed to save');
    }
    return response.json();
   })
   .then(data => {
     console.log(data);
   })
   .catch(error => {
     console.error('There has been a problem with your fetch operation:', error);
   });
};

// export async function updateData(url = '', data = {}) {
//
//   try {
//   const response = await fetch(url, {
//     method: 'PUT',
//     headers: {
//       'Content-Type': 'application/json'
//     },
//     body: JSON.stringify(data) // body data type must match "Content-Type" header
//   });
//   return response.json();
//   if (!response.ok) {
//       throw new Error('Network response was not ok');
//     }
//     console.log("Put successful");
//   } catch (error) {
//     console.error("PUT error: ", error);
// }
// }
//
// export async function deleteData(url = '', data = {}) {
//   try {
//   const response = await fetch(url, {
//     method: 'DELETE',
//     headers: {
//       'Content-Type': 'application/json'
//     },
//     body: JSON.stringify(data) // body data type must match "Content-Type" header
//   });
//   return response.json();
//   if (!response.ok) {
//       throw new Error('Network response was not ok');
//     }
//     console.log("Delete successful");
//   } catch (error) {

//
// }


