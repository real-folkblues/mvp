'use client'

import { useEffect, useState } from "react";

"use client"

export default function ClientPage(){
    const [todos, setTodos] = useState<any[]>([])
    const [loading, setLoading] = useState(true)
    const [error, setError] = useState(false)


    // lgTask()

    useEffect(() => {
    },[])

    console.log("Client")

    if (loading) return <p>Loading...</p>
    if (error) return <p>Error</p>//insert eva error

    return (


    )
}