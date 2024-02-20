

// methodHandler.jsx
const webUrl = "http://localhost:8080";


export async function postData(endpoint = '', data = {}) {
  const postUrl = `${webUrl}${endpoint}`;
  try {
  const response = await fetch(postUrl, {
    method: 'POST', 
    headers: {
      'Content-Type': 'application/json'
    },
    body: JSON.stringify(data) // body data type must match "Content-Type" header
  });
  return response.json();
  if (!response.ok) {
      throw new Error('Network response was not ok');
    }
    console.log("saved successful");
  } catch (error) {
    console.error("POST error: ", error); // parses JSON response into native JavaScript objects
}
}

export async function getData(endpoint = '') {
  const getUrl = `${webUrl}${endpoint}`; // Correctly constructs the full URL
  try {
    const response = await fetch(getUrl, {
      method: 'GET', 
      headers: {
        'Content-Type': 'application/json'
      }
    });
    if (!response.ok) {
        throw new Error('Network response was not ok');
      }
      console.log("GET successful");
    return response.json();
  } catch (error) {
    console.error("GET error: ", error);
  }
}

export async function updateData(endpoint = '', data = {}) {
  const putUrl = `${webUrl}${endpoint}`;
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



export async function deleteData(endpoint = '', data = {}) {
  const delUrl = `${webUrl}${endpoint}`;
  try {
  const response = await fetch(delUrl, {
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


