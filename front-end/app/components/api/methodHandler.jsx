import React from 'react';

const url = 'http://localhost:3306;'

export async function handleSave(url = '', data = {}) {
  try {
    const response = await fetch('url, /japanese-api', { // Change this URL to your actual backend endpoint
      method: 'POST',
      headers: {
        'Content-Type': 'application/json',
      },
      body: JSON.stringify(kanjiData),
    });

    if (!response.ok) {
      throw new Error('Failed to save');
    }

    console.log("Save successful");
    alert("Saved!")

  } catch (error) {
    console.error("Save error: ", error);
    // Optionally, display an error message to the user
  }
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
//     console.error("DELETE error: ", error);
//
// }
}

