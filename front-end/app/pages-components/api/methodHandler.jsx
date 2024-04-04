

const url = 'http://localhost:8080/api/saveKanji'; // Corrected URL and added API endpoint

// Updated function to accept setKanjiData and setError as arguments
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
    setKanjiData(data); // Assuming you want to update your state with the response
  } catch (error) {
    setError(error.message); // Assuming setError updates your component's state
  }
};


//PUT method

const updateUrl = 'http://localhost:8080/updateKanji'
export const updateData = async (kanjiData, setKanjiData, setError) => {
  try {
    const response = await fetch(updateUrl, {
      method: 'PUT',
      headers: {
        'Content-Type': 'application/json'
      },
      body: JSON.stringify(kanjiData) // body data type must match "Content-Type" header
    });
    if (!response.ok) {
        throw new Error('Network response was not ok');
    }
    console.log(kanjiData); // Log data if needed before processing the response
    return await response.json();
  } catch (error) {
    console.error("PUT error: ", error);
    setError(error.message); // Update error state
  }
}


const deleteUrl = 'http://localhost:8080/deleteKanji'
export const deleteData = async (kanjiData, setKanjiData, setError) => {
  try {
    const response = await fetch(deleteUrl, {
      method: 'DELETE',
      headers: {
        'Content-Type': 'application/json'
      },
      body: JSON.stringify(kanjiData) // body data type must match "Content-Type" header
    });
    if (!response.ok) {
        throw new Error('Network response was not ok');
    }
    console.log(kanjiData); // Log data if needed
    // If your DELETE endpoint responds with JSON data
    return await response.json();
    // If your DELETE endpoint does not respond with data, you might just return a success message or status
  } catch (error) {
    console.error("DELETE error: ", error);
    setError(error.message); // Update error state
  }
}




