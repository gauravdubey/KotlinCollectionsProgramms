package com.gaurav.kotlincollectionlib.collectionSample

import com.gaurav.kotlincollectionlib.others.Person

fun main(){
    val persons = listOf(
        Person("Gaurav",25,"Male","Indian"),
        Person("Rahul",35,"Male","Indian"),
        Person("Neha",22,"Female","UK"),
        Person("Gagan",29,"Male","USA"),
        Person("Ramesh",30,"Male","Indian"),
        Person("Priya",26,"Female","UK")
    )

    val listCities = listOf("Bangalore","Hyderabad","Chennai","Pune","Mumbai","Mangalore","Delhi","Lucknow","Jaipur","Kolkata","Ahmedabad")

    println("Sorted by Name: ")
    persons.sortedBy { it.name }.forEach{println(it)}
    println("Sorted by Age: ")
    persons.sortedBy { it.age }.forEach{println(it)}
    println("Sorted by Nationality: ")
    persons.sortedBy { it.nationality }.forEach{println(it)}
    println("Sorted by Gender: ")
    persons.sortedBy { it.gender }.forEach{println(it)}
    println("**************************** Sorted with ****************************")
    println("Sorted by Name: ")
    persons.sortedWith(compareBy { it.name }).forEach{println(it)}
    println("Sorted by Age: ")
    persons.sortedWith(compareBy { it.age }).forEach{println(it)}
    println("Sorted by Nationality: ")
    persons.sortedWith(compareBy { it.nationality }).forEach{println(it)}

    println("Reversed the order : ")
//    persons.reversed().forEach { println(it) }
//    persons.asReversed().forEach { println(it) }

    println(" Shuffled :")
    persons.shuffled().forEach { println(it) }

}