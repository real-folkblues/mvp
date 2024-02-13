
export async function fetchData() {
  const res = await fetch('localhost:8888/kanjis');
  const data = await res.json();
  return  data;
  console.log(data);
}