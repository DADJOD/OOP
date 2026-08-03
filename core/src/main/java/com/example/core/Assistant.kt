package com.example.core

class Assistant {
    fun bringCoffee(count: Int, coffeeType: String) {
        repeat(count) {
            println("I'm bringing \"$coffeeType\" coffee!")
        }
    }
}