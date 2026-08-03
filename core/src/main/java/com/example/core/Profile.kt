package com.example.core

fun main() {
    val john = Person()
    val jack = Person()

//    println("Enter name for first person: ")
//    john.name = readln()
//    println("Enter age for first person: ")
//    john.age = readln().toInt()
//    println("Enter height for first person: ")
//    john.height = readln().toInt()
//    println("Enter weight for first person: ")
//    john.weight = readln().toInt()
//
//    println("Enter name for second person: ")
//    jack.name = readln()
//    println("Enter age for second person: ")
//    jack.age = readln().toInt()
//    println("Enter height for second person: ")
//    jack.height = readln().toInt()
//    println("Enter weight for second person: ")
//    jack.weight = readln().toInt()
//
//
//    println(
//        "First person name: ${john.name} and age: ${john.age} " +
//                "and height: ${john.height} and weight: ${john.weight}"
//    )
//    println(
//        "Second person name: ${jack.name} and age: ${jack.age} " +
//                "and height: ${jack.height} and weight: ${jack.weight}"
//    )

    john.sayHello()
    jack.sayHello()
    john.run()
    jack.run()

}