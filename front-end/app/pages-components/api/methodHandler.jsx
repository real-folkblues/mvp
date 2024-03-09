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
    alert("Saved successfully!");
    console.log(kanjiData); // Assuming you want to update your state with the response
  } catch (error) {
    setError(error.message); // Assuming setError updates your component's state
  }
};

//PUT method
export const updateData = async (kanjiData, setKanjiData, setError) => {

  try {
  const response = await fetch(url, {
    method: 'PUT',
    headers: {
      'Content-Type': 'application/json'
    },
    body: JSON.stringify(data) // body data type must match "Content-Type" header
  });
  return response.json();
  if (!response.ok) {
      throw new Error('Network response was not ok');
    }
    console.log("Put successful");
  } catch (error) {
    console.error("PUT error: ", error);
}
}

export const deleteData = async (kanjiData, setKanjiData, setError) => {
  try {
  const response = await fetch(url, {
    method: 'DELETE',
    headers: {
      'Content-Type': 'application/json'
    },
    body: JSON.stringify(data) // body data type must match "Content-Type" header
  });
  return response.json();
  if (!response.ok) {
      throw new Error('Network response was not ok');
    }
    console.log("Delete successful");
  } catch (error) {
console.error("DELETE error: ", error);
  }
}



