

export async function postData(url = '', data = {}) {
  
  try {
  const response = await fetch(url, {
    method: 'POST', // *GET, POST, PUT, DELETE, etc.
    headers: {
      'Content-Type': 'application/json'
    },
    body: JSON.stringify(data) // body data type must match "Content-Type" header
  });
  return response.json();
  if (!response.ok) {
      throw new Error('Network response was not ok');
    }
    console.log("GET successful");
  } catch (error) {
    console.error("GET error: ", error); // parses JSON response into native JavaScript objects
}
}

export async function getData(url = '', data = {}) {

    try {
  const response = await fetch(url, {
    method: 'GET', 
    headers: {
      'Content-Type': 'application/json'
    },
    body: JSON.stringify(data) // body data type must match "Content-Type" header
  });
  return response.json();
  if (!response.ok) {
      throw new Error('Network response was not ok');
    }
    console.log("GET successful");
  } catch (error) {
    console.error("GET error: ", error); // parses JSON response into native JavaScript objects
}
}

export async function updateData(url = '', data = {}) {
  
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



export async function deleteData(url = '', data = {}) {
 
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


