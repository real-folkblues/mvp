"use client"
import React, { useState } from 'react';
import { useRouter } from 'next/navigation';

export default function ClientPage(){
    const [ name, setName ] = useState( '' );
    const [ fridge, setFridge ] = useState( '' );
    const [ tastingNotes, setTastingNotes ] = useState( '' );
    const [ abv, setAbv ] = useState( '' );
    const [ setting, setSetting ] = useState( '' );
    const [ readingMaterial, setReadingMaterial ] = useState( '' );
    const [ sockColor, setSockColor ] = useState( '' );
    const [ listNumber, setListNumber ] = useState( '' );
    const [ favorite, setFavorite ] = useState( '' );
    const [ username, setUsername ] = useState( '' );

    //manage error message 
    const [ errorMessage, setErrorMessage ] = useState( '' );

    //manage redirection
    const router = useRouter();

    const handleSubmit = async ( event ) =>
    {
        event.preventDefault();

        const data = {
            name: event.target.name.value,
            : event.target.name.value,
            : event.target.tastingNotes.value,
            : event.target.abv.value,
            : event.target.setting.value,
            : event.target.readingMaterial.value,
            : event.target.sockColor.value,
            : event.target.listNumber.value,
            : false,
            : usernameCookie,
        }

        console.log( data );
    
        try
        {
            const response = await fetch( webUrl + "/api/client", {
                method: 'POST',
                headers: {
                    "Content-Type": "application/json"
                },
                body: JSON.stringify( data ),
            } );

            //check for a 4 or 500 response code
            if ( !response.ok )
            {
                throw new Error( `Sick Eva font error` );
            }

            if ( response.ok )
            {
                console.log( response.body );
                router.push( '/api/server' );
            }

        }
    }}