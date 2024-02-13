"use client";


import React from 'react';
import { useState } from 'react';



const ClientSearch = () =>
{
    const [errorMessage, setErrorMessage] = useState(null);
    const [ data, setData ] = useState( null );
    //
    const [ kanji, setKanji ] = useState( '' );
    // const [ vocab, setVocab ] = useState( '' );
    // const [ particles, setParticles ] = useState( '' );


    //searches api kanji, vocab, and particles
    const [ value, setValue ] = useState( '' );
    const webUrl = "localhost:3000/api/kanjis";

    const [isLoading, setIsLoading] = useState(false);
    
    const handleSubmit = async ( event ) =>
    {
        event.preventDefault();
        setIsLoading(true); //start loading

        try
        {

            const res = await fetch( webUrl, {
                method: 'POST',
                headers: {
                    'Content-Type': 'application/json',
                },
                body: JSON.stringify( { value } ),
            } );
            if ( !res.ok )
            {
                //
                throw new Error( 'You will (NOT) post' )
            }

            const responseData = await res.json();
            console.log(responseData);
            setData(responseData); //set the data to the response data



            setKanji( '' );
            // setVocab( '' );
            // setParticles( '' );
        } catch ( error )
        {
            setErrorMessage( error.message );
            console.error( "There is (NOT) a match", error );

        }

        setIsLoading(false); //stop loading
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
                {/* <label htmlFor="vocab">Vocab</label>
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
                /> */}
                <br />
                <br />
                <button type="submit">Submit</button>
            </form>
            {/* Render the data from the API */ }
            <div>
            { isLoading ? <div>Loading...</div> : <div>Data: {JSON.stringify(data, 2)}</div>}

            
            </div>
        </div>
    );
}

export default ClientSearch;