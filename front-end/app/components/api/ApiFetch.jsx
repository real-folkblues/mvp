
export async function fetchData() {
  const res = await fetch('localhost:8888');
  const data = await res.json();
  return  data;
  
}