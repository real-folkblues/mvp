import React, { useState } from 'react';
import { handleSave } from "./methodHandler.jsx";

const KanjiSearch = () => {
  const [loading, setLoading] = useState(false);
  const [kanjiData, setKanjiData] = useState(null);
  const [error, setError] = useState(null);
  const [kanji, setKanji] = useState('猫'); // Initialize kanji state with '猫'

  const handleSubmit = async (event) => {
    event.preventDefault(); // Prevent form from submitting traditionally
    setLoading(true);
    setError(null);
    try {
      const response = await fetch(`https://kanjiapi.dev/v1/kanji/${kanji}`);
      if (!response.ok) {
        throw new Error('Failed to fetch');
      }
      const data = await response.json();
      setKanjiData(data);
    } catch (error) {
      setError(error.message);
    } finally {
      setLoading(false);
    }
  };

  return (
    <div>
      <form onSubmit={handleSubmit}>
        <label htmlFor="kanji">Kanji</label>
        <input
          type="text"
          id="kanji"
          value={kanji}
          onChange={(e) => setKanji(e.target.value)}
        />
        <button type="submit">Fetch Kanji</button>
      </form>
      {loading && <p>Loading...</p>}
      {error && <p>Error: {error}</p>}
      {kanjiData && (
        <div>
          <h2>Kanji Details</h2>
          <p>Kanji: {kanjiData.kanji}</p>
          <p>Grade: {kanjiData.grade}</p>
          <p>Stroke Count: {kanjiData.stroke_count}</p>
          <p>Meanings: {kanjiData.meanings.join(', ')}</p>
          <p>Kun Readings: {kanjiData.kun_readings.join(', ')}</p>
          <p>On Readings: {kanjiData.on_readings.join(', ')}</p>
          <p>JLPT Level: N{kanjiData.jlpt}</p>
          <p>Unicode: {kanjiData.unicode}</p>
          <button onClick={() => handleSave(kanjiData, setKanjiData, setError)}>Save Kanji</button>
        </div>
      )}
    </div>
  );
};

export default KanjiSearch;
