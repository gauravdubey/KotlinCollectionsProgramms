package com.gaurav.kotlincollectionlib.others

class Tiger(name: String, age: Int): WildAnimal(name, age) {
    override fun makeSound() {
        println("$name is making a sound")
    }
}