import { Client } from "../components/Client"


export default async function Server(){
    const todos = await fetch("https://jsonplaceholder.typicode.com/todos")
    .then(res => res.json())
    .then(data => data as any[])
}
    console.log("server")

    return (
        <>
            <h1>Server Page</h1></><ul>{todos.map(todo => (
                <li key={todo.id}>{todo.title}</li>))}</ul><Client/>)</>
            </>

    
