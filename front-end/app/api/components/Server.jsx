// import { useRouter } from 'next/router';

// // ...

// const handleSubmit = async (e) => {
//   e.preventDefault();

//   // Send a POST request to the server
//   const response = await fetch('/api/form', {
//     method: 'POST',
//     headers: {
//       'Content-Type': 'application/json',
//     },
//     body: JSON.stringify(formData),
//   });

//   // Check if the request was successful
//   if (response.ok) {
//     // Get the router instance
//     const router = useRouter();

//     // Navigate to the new page
//     router.push('/new-page');
//   } else {
//     // Handle error...
//   }
// };