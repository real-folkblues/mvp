// hooks/useForm.js
import { useState } from 'react';

const url = 'http://localhost:8080/login'

export const useForm = async (callback) => {
  const [inputs, setInputs] = useState({});

  const handleSubmit = (event) => {
    if (event) {
      event.preventDefault();
    }
    callback(); // Perform your logic here, e.g., making an API call
  };

  const handleInputChange = (event) => {
    event.persist();
    setInputs(inputs => ({...inputs, [event.target.name]: event.target.value}));
  };

  return {
    handleSubmit,
    handleInputChange,
    inputs,
  };
};


