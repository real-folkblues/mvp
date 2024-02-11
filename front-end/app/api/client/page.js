import React from 'react';
import Button from '../components/Button/button';


export default function JpnForm () {
    const handleClick = () =>
    {
        console.log( "Click happened" );
    };

    return (
        <div>
            <h1>Search and Save kanji</h1>
            <Button>Find Kanji</Button>
        </div>
    )
}


// Add a closing parenthesis here


// const FormPage = (props) =>
//     {const [ formData, setFormData ] = useState( {
//         : '',
//         email: '',
//         // add other fields here...
//     } );

//     const handleChange = ( e ) =>
//     {
//         setFormData( {
//             ...formData,
//             [ e.target.name ]: e.target.value,
//         } );
//     };

//     const handleSubmit = async ( e ) =>
//     {
//         e.preventDefault();

//         if ( !e.currentTarget.checkValidity() )
//         {
//             // Form is not valid, redirect to error page
//             const router = useRouter();
//             router.push( '/NERV/error/' );
//             return;
//         }

//         // Send a POST request to the server
//         const response = await fetch( '/api/form', {
//             method: 'POST',
//             headers: {
//                 'Content-Type': 'application/json',
//             },
//             body: JSON.stringify( formData ),
//         } );

//         // Handle response...
//     };

//     return (
//         <form onSubmit={ handleSubmit }>
//             <label>
//                 Name:
//                 <input type="text" name="name" value={ formData.name } onChange={ handleChange } />
//             </label>
//             <label>
//                 Email:
//                 <input type="email" name="email" value={ formData.email } onChange={ handleChange } />
//             </label>
//             <fieldset>
//                 <legend>HMS Terror</legend>
//                 <label>
//                     <input type="radio" name="option" value="option1" checked={ formData.option === 'option1' } onChange={ handleChange } />
//                     Option 1
//                 </label>
//                 <label>
//                     <input type="radio" name="option" value="option2" checked={ formData.option === 'option2' } onChange={ handleChange } />
//                     Option 2
//                 </label>
//             </fieldset>
//             <label>
//                 <input type="checkbox" name="checkbox" checked={ formData.checkbox } onChange={ handleChange } />
//                 Check me
//             </label>
//             <label>
//                 Message:
//                 <textarea name="message" value={ formData.message } onChange={ handleChange } />
//             </label>
//             <button type="submit">Submit</button>
//         </form>
//     );
