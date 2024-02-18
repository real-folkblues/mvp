
// import React, { useState, useEffect } from 'react';
// import { fetchKanjiDetails } from '../fetchKanji.jsx';

// export default function KanjiResponse = () => {
//   const [kanjiData, setKanjiData] = useState(null);
//   const [error, setError] = useState(null);

//   useEffect(() => {
//     // Replace '猫' with the kanji character you want to fetch
//     const character = '猫'; 
//     fetchKanjiDetails(character)
//       .then(data => {
//         setKanjiData(data);
//       })
//       .catch(error => {
//         setError(error.toString());
//       });
//   }, []);

//   if (error) return <div>Error: {error}</div>;
//   if (!kanjiData) return <div>Loading...</div>;

//   return (
//     <div>
//       <h2>Kanji Details</h2>
//       <p>Kanji: {kanjiData.kanji}</p>
//       <p>Grade: {kanjiData.grade}</p>
//       <p>Stroke Count: {kanjiData.stroke_count}</p>
//       <p>Meanings: {kanjiData.meanings.join(', ')}</p>
//       <p>Kun Readings: {kanjiData.kun_readings.join(', ')}</p>
//       <p>On Readings: {kanjiData.on_readings.join(', ')}</p>
//       <p>JLPT Level: N{kanjiData.jlpt}</p>
//       <p>Unicode: {kanjiData.unicode}</p>
//     </div>
//   );
// };

// export default KanjiResponse;
