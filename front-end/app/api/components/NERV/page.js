import { useRouter } from 'next/router';
import { useState } from 'react';
import { Form } from 'react-bootstrap';

// ...

const handleSubmit = async ( e ) =>
{
    e.preventDefault();


    const data = await response.json();

    // Check if the object was created
    if ( data.created )
    {
        // Object was created, handle success...
    } else
    {
        // Object was not created, handle error...
    }// Handle response...
};