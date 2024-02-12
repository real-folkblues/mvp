
export async function fetchData() {
  const res = await fetch('http://localhost:8888/kanjis');
  const data = await res.json();
  return  data;
}