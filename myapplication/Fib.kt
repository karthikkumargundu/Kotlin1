package com.example.myapplication

fun main()
{
    var range = Integer.valueOf(readLine())
    var x = 0
    var y = 1
    print(x)
    print(" ")
    print(y)
    print(" ")
    for(i in 1..range-2)
    {   var z = x+y
        print(z)
        print(" ")
        x=y
        y=z
    }
}