"use client";

import React from 'react';
import { useState } from 'react';


const ApiPage = () =>
{
    //
    const [ kanji, setKanji ] = useState( '' );
    const [ vocab, setVocab ] = useState( '' );
    const [ particles, setParticles ] = useState( '' );

    //searches api kanji, vocab, and particles
    const [ value, setValue ] = useState( '' );
    const webUrl = "http://localhost:8888/kanjis";


    const handleSubmit = async ( event ) =>
    {
        event.preventDefault();

        try
        {

            const res = await fetch( webUrl, {
                method: 'POST',
                headers: {
                    'Content-Type': 'application/json',
                },
                body: JSON.stringify( { value } ),
            } );
            if ( !response.ok )
            {
                // checking if response status is not OK (as in a 4-- or 5-- response status code)
                throw new Error( 'You will (NOT) post' )
            }

            const data = await res.json();
            console.log( data );
            setValue( data );

            setKanji( '' );
            setVocab( '' );
            setParticles( '' );
        }
        // Handle respo } 
        catch ( error )
        {
            setErrorMessage( error.message );
            console.error( 'There is (NOT) a match', error );

        }
    };

    return (
        <div>
            <h1>Search and Save by</h1>
            <form onSubmit={ handleSubmit }>
                <label htmlFor="kanji">Kanji</label>
                <input
                    type="radio"
                    id="kanji"
                    value={ kanji }
                    onChange={ ( e ) => setValue( e.target.value ) }
                />
                <label htmlFor="vocab">Vocab</label>
                <input
                    type="radio"
                    id="vocab"
                    value={ vocab }
                    onChange={ ( e ) => setValue( e.target.value ) }
                />
                <label htmlFor="particles">Particles</label>
                <input
                    type="radio"
                    id="particles"
                    value={ particles }
                    onChange={ ( e ) => setValue( e.target.value ) }
                />
                <br />
                <br />
                <button type="submit">Submit</button>
            </form>
            {/* Render the data from the API */ }
            {/* <pre>{ JSON.stringify( data, null, 2 ) }</pre> */ }
        </div>
    );
}

export default ApiPage;