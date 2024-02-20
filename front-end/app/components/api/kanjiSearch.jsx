import React, { useState, lazy } from 'react';
import fetchKanjiDetails from '../Api/fetchApi.jsx';
import styles from '/app/main.module.css';

  
const KanjiSearch = () => {
  const [loading, setLoading] = useState(false);
  const [showAnimation, setShowAnimation] = useState(false);
  const [kanjiData, setKanjiData] = useState(null);
  const [error, setError] = useState(null);
  const [kanji, setKanji] = useState('猫'); // Initialize kanji state with '猫'

  const handleSubmit = async (event) => {
    event.preventDefault();
    setShowAnimation(true);
    setLoading(true);
    setError(null);
    try {
      const data = await fetchKanjiDetails(kanji);
      setKanjiData(data);
    } catch (error) {
      setError(error.message);
    } finally {
      setLoading(false);
      setShowAnimation(false);
    }
  };
  
  return (
    
    <div className="container">
      <h1>Kanji Search</h1>
      <style jsx>{`
        .container {
          display: flex;
    flex-direction: column;
    line-height: 2;
    justify-content: center;
    align-items: center;
    height: 100vh;
    background-color: #c69bd4;
        }
      `}</style>
      <form onSubmit={handleSubmit}>
        <label htmlFor="kanji">Kanji Search:    </label>
        <input
          type="text"
          id="kanji"
          value={kanji}
          onChange={(e) => setKanji(e.target.value)}
        />
        
        <button className='button' type="submit">送信</button>
        
      </form>
      {/* {showAnimation && <GridEffect />} */}
      {loading && <p>Loading...</p>}
      {error && <p>Error: {error}</p>}
      {kanjiData && <div>
        {/* Render your kanjiData here */}
        <h2>Kanji Details</h2>
        <p>Kanji: {kanjiData.kanji}</p>
       <p>Grade: {kanjiData.grade}</p>
       <p>Stroke Count: {kanjiData.stroke_count}</p>
       <p>Meanings: {kanjiData.meanings.join(', ')}</p>
       <p>Kun Readings: {kanjiData.kun_readings.join(', ')}</p>
       <p>On Readings: {kanjiData.on_readings.join(', ')}</p>
       <p>JLPT Level: N{kanjiData.jlpt}</p>
       <p>Unicode: {kanjiData.unicode}</p>
        {/* Add more data rendering as needed */}
      </div>}
    </div>
  );
  
      }
export default KanjiSearch;
