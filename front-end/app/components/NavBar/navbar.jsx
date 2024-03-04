'use client'

import Link from 'next/link';
import FridgeSearch from './fridge-admin/FridgeSearch';
import { useRouter } from 'next/navigation';
import { useState } from 'react';
import FridgeDisplay from './fridge-admin/FridgeDisplay';

const NavBarCustom = () => {
  
  const [searchUser, setSearchUser] = useState('');
  


  const handleSearch = (event) =>{
    event.preventDefault();
    
  } 

//         try {
//           const response = await fetch(http://localhost:3000/api/saveKanji`)
//           //don't need this method chaining because you are using 'await'
//           // .then(response => response.json())
//           // .then(data => {

//           const data = await response.json();
           
//             console.log('Fetched data:', data);

//            

    return (
        <div className='topnav'>
            <h2>User Dashboard</h2>
            <a href='http://localhost:3000/client'>Begin your search</a>
            <a href="http://localhost:3000/kanji/vault">Your Kanji Vault</a>
            <a href='http://localhost:3000/logout'>Logout</a>
            <form onSubmit={handleSearch}>
              <label>
              {/* Search for username: */}
              <input type="text" value={searchUser} onChange={(e) => setSearchUser(e.target.value)} placeholder='Type username to find fridge' />
              </label>
              <button type="submit">Search</button>
          </form>
            {/* {allBeers} */}
        </div>
    
    );
    } 

    export default NavBarCustom;
    