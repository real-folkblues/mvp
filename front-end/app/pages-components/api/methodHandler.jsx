import React from 'react';
const url = 'http://localhost:8080/api/saveKanji'

export const handleSave = async (kanjiData, setKanjiData, setError) => {
  try {
    const response = await fetch(url, {
      method: 'POST',
      headers: {
        'Content-Type': 'application/json',
      },
      body: JSON.stringify(kanjiData) // Directly stringify kanjiData
    });
    if (!response.ok) {
        throw new Error('Failed to save');
    }
    const data = await response.json();
    setKanjiData(data);
    console.log(kanjiData); // Assuming you want to update your state with the response
  } catch (error) {
    setError(error.message); // Assuming setError updates your component's state
  }
};

// //PUT method

// const updateUrl = 'http://localhost:8080/updateKanji'
// export const updateData = async (kanjiData, setKanjiData, setError) => {

//   try {
//   const response = await fetch(updateUrl, {
//     method: 'PUT',
//     headers: {
//       'Content-Type': 'application/json'
//     },
//     body: JSON.stringify(kanjiData) // body data type must match "Content-Type" header
//   });
//   return response.json();
//   if (!response.ok) {
//       throw new Error('Network response was not ok');
//     }
//     console.log(kanjiData);
//   } catch (error) {
//     console.error("PUT error: ", error);
// }
// }

// const deleteUrl = 'http://localhost:8080/deleteKanji'
// export const deleteData = async (kanjiData, setKanjiData, setError) => {
//   try {
//   const response = await fetch(deleteUrlrl, {
//     method: 'DELETE',
//     headers: {
//       'Content-Type': 'application/json'
//     },
//     body: JSON.stringify(kanjiData) // body data type must match "Content-Type" header
//   });
//   return response.json();
//   if (!response.ok) {
//       throw new Error('Network response was not ok');
//     }
//     console.log(kanjiData);
//   } catch (error) {
// console.error("DELETE error: ", error);
//   }
// }



