import { fetchData } from './apiFetch.jsx';
import { useState } from 'react';
import { useEffect } from 'react';


const KanjiResult = () => {
  const [data, setData] = useState(null);

  useEffect(() => {
    fetchData().then((data) => setData(data));
  }, []);

  return (
    <div>
      {data ? JSON.stringify(data) : ''}
    </div>
  );
}

export default KanjiResult;