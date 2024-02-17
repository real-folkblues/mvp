// app/client/HomePage.js
'use client'

import React from 'react';

import ClientSearch from '../components/Api/clientSearch.jsx';
import KanjiResult from '../components/Api/kanjiResult.jsx';


export default function ClientRoute() {
  return (
    <div>
      <clientSearch />
      <kanjiResult />
    </div>
  );
}