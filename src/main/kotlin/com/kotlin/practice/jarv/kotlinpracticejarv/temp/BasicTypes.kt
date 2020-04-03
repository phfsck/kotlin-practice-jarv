package com.kotlin.practice.jarv.kotlinpracticejarv.temp

class BasicTypes {
    fun run() {

        val threeBillion: Long
        threeBillion = 3000000000 // Long
        println(threeBillion)
        val myFloat = 1f
        val myAny: Any?
        myAny = myFloat
        when(myFloat) {
            is Float -> println("it is a float!")
//            is Long -> println("it is Long!")
            else ->
                println("not a float!")
        }

        val a: Int = 10000
        println(a === a)

        val b: Byte = 1
        val i: Int = b.toInt()
        println(i)

        val c: Char = 'd'
        if(c in '0'..'c') {
            println("char $c is in range!")
        }

        val l = 1L + 3
        println(l)


    }
}