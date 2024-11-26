package com.gaurav.kotlincollectionlib.others

class Cat(name: String, age: Int) : DomesticAnimal(name, age) {
    override fun makeSound() {
        println("$name says Meow!")
    }
}