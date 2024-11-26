package com.gaurav.kotlincollectionlib.collectionSample

import com.gaurav.kotlincollectionlib.others.Person

fun main(){
    var persons = listOf(
        Person("Gaurav",25,"Male","Indian"),
        Person("Rahul",35,"Male","Indian"),
        Person("Neha",22,"Female","UK"),
        Person("Gagan",29,"Male","USA"),
        Person("Ramesh",30,"Male","Indian"),
        Person("Priya",26,"Female","UK"))

//    persons.groupBy { it.name.startsWith("R") }.forEach{ println("${it.key} -> ${it.value}") }
//    persons.groupBy { it.nationality }.forEach { println("${it.key} -> ${it.value}")}
    val groupByAge= persons.groupBy { it.age>18 }
//    println(groupByAge)
//    println(persons.groupingBy { it.age>30 }.eachCount())
//    val groupByAlphabet=persons.groupBy { it.name.get(0) }
//    println(groupByAlphabet)
//    println(persons.groupingBy { it.name.get(0) }.eachCount())


    // Transformation
    val transformMap=persons.groupBy (keySelector = {if (it.age>25) "Major" else "Minor"}, valueTransform = {it})
//    println(transformMap)

    val listOfNumber= listOf(23,49,3,5,6,3,6,8,7,9,4,11,45,22,21)
    // fold
//    println("Total sum of people age ${persons.fold(0){acc,person -> acc+person.age}}")
//    println("Total sum of numbers ${listOfNumber.fold(0){acc,number -> acc+number}}")
    // Reduce
//    println("Total sum of numbers ${listOfNumber.reduce{acc,number -> acc+number}}")
//    println("Total Product of numbers ${listOfNumber.reduce{acc,number -> acc*number}}")

    // Aggregate functions
    println("Sum of All number using sum: ${listOfNumber.sum()}")
    println("Sum of All number using sumOf: ${listOfNumber.sumOf { it}}")
    println("Average of All number using average: ${listOfNumber.average()}")
    println("Maximum of All number using max: ${listOfNumber.max()}")
    println("Minimum of All number using min: ${listOfNumber.min()}")
    println("Maximum of All number using maxBy: ${listOfNumber.maxBy { it }}")
    println("Minimum of All number using minBy: ${listOfNumber.minBy { it }}")
    println("Count of number using count: ${listOfNumber.count()}")
    println("Distinct number in the list : ${listOfNumber.distinct()}")
    println("Sort the number by Descending order : ${listOfNumber.sortedDescending() }")
    println("Sort the number by Ascending order : ${listOfNumber.sorted() }")
}