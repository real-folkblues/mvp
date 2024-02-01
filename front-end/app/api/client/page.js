"use client"

import React, { useState } from 'react';

export default function FormPage ()
{
    const [ formData, setFormData ] = useState( {
        name: '',
        email: '',
        // add other fields here...
    } );

    const handleChange = ( e ) =>
    {
        setFormData( {
            ...formData,
            [ e.target.name ]: e.target.value,
        } );
    };

    const handleSubmit = async ( e ) =>
    {
        e.preventDefault();

        // Send a POST request to the server
        const response = await fetch( '/api/form', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json',
            },
            body: JSON.stringify( formData ),
        } );

        // Handle response...
    };

    return (
        <form onSubmit={ handleSubmit }>
            <label>
                Name:
                <input type="text" name="name" value={ formData.name } onChange={ handleChange } />
            </label>
            <label>
                Email:
                <input type="email" name="email" value={ formData.email } onChange={ handleChange } />
            </label>
            {/* Add other fields here... */ }
            <button type="submit">Submit</button>
        </form>
    );
}