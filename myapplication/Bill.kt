package com.example.myapplication

fun main()
{
    println("Enter the Product Price: ")
    var price = Integer.valueOf(readLine())
    println("Enter the Product Quantity")
    var quant = Integer.valueOf(readLine())
    var bill = quant*price
    println("The Bill Amount is ${bill}")
    var dis = bill-(bill*0.15)
    println("After Allowing 15% Dicount The Bill Amount is: ${dis} ")

}