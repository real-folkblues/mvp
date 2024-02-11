
export async function ApiFetch() {
  const res = await fetch('http://localhost:8888');
  const data = await res.json();
  return  { props: { data } };
}