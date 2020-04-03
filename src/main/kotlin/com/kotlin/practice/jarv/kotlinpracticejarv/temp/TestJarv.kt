package com.kotlin.practice.jarv.kotlinpracticejarv.temp

class TestJarv {
    fun run() {
        val person = Person("Jarvy", "Alvarez")
        println("running..." + person.firstName)
        println(person.lastName)
        person.firstName = "Jennifer"
        person.lastName = "Fruelda"
        println("running..." + person.firstName)
        println(person.lastName)
    }
}

class Person constructor(firstName: String, lastName: String){
    var firstName: String = firstName
    var lastName: String = lastName
}

class Address {
    var name: String = ""
        get() = field
        set(value) { field = value }
}

class Temporary {

}