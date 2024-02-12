// app/client/HomePage.js
'use client'
import React from 'react';

import ClientSearch from '../components/api/ClientSearch.jsx';
import KanjiResult from '../components/api/KanjiResult.jsx';


export default function ClientRoute() {
  return (
    <div>
      <ClientSearch />
      <KanjiResult />
    </div>
  );
}