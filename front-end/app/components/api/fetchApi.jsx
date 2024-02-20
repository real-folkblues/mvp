

const fetchKanjiDetails = async (kanji) => {
  const response = await fetch(`https://kanjiapi.dev/v1/kanji/${kanji}`);
  if (!response.ok) {
    throw new Error('Network response was not ok');
  }
  const data = await response.json();
  return data;
};

export default fetchKanjiDetails;