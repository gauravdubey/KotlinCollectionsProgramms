package com.gaurav.kotlincollectionlib.others

class Dog(name: String, age: Int): DomesticAnimal(name, age) {
    override fun makeSound() {
        println("$name is barking")
    }
}