package com.practice.kotlin

fun main(args: Array<String>) {
    println(sum(1, 2))
    println(sum1(3, 4))
    myPrint(2,3)
}

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun sum1(a: Int, b: Int) = a + b

fun myPrint(a: Int, b: Int): Unit {
    println(a + b)
}