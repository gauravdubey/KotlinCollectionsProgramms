package com.gaurav.kotlincollectionlib.collectionSample

import com.gaurav.kotlincollectionlib.others.Animal
import com.gaurav.kotlincollectionlib.others.Cat
import com.gaurav.kotlincollectionlib.others.Dog
import com.gaurav.kotlincollectionlib.others.Person
import com.gaurav.kotlincollectionlib.others.Tiger

fun main(){
    var persons = listOf(
        Person("Gaurav",25,"Male","Indian"),
        Person("Rahul",35,"Male","Indian"),
        Person("Neha",22,"Female","UK"),
        Person("Gagan",29,"Male","USA"),
        Person("Ramesh",30,"Male","Indian"),
        Person("Priya",26,"Female","UK")
    )

//    println(persons)
//    var transformList=persons.mapIndexed { index, person -> "${index} - ${person.name}"}
    var transformList=persons.mapNotNull{ if(it.nationality!="UK") it.name else null}
//    println(transformList)

    var citimap = mutableMapOf<String,String>()
    citimap.put("Uttar Pradesh","Lucknow")
    citimap.put("Karnataka","Bangalore")
    citimap.put("Maharashtra","Mumbai")
    citimap.put("Tamil Nadu","Chennai")
    citimap.put("Gujarat","Gandhinagar")
    citimap.put("Madhya Pradesh","Bhopal")
    citimap.put("Rajasthan","Jaipur")

//    println(citimap)
//    println(citimap.mapKeys { it.key.uppercase()})
//    println(citimap.keys)

    //Zipping
    val citiList=citimap.values.toList()
    val zippedCity=citiList.zip(persons)
    val unZippedCities=zippedCity.unzip()
//    println(zippedCity)
//    println(unZippedCities)
    val unZippedCitiesToList=unZippedCities.toList().flatten()
//    println(unZippedCitiesToList)
//    val finalResult= unZippedCitiesToList.also { it.forEach { println(it) } }
//    println(finalResult)

    // Filtering

//    persons.filter { it.nationality=="Indian" }.forEach { println(it) }
//    persons.filter { it.age>=30 }.forEach{println(it)}
//    citimap.filter { entry -> entry.value.equals("Bangalore") }.forEach { println(it) }

    val animalList = listOf<Animal>(Cat("Kitty", 3), Dog("John", 5), Tiger("Tigger", 2))
//    animalList.filterIsInstance<Cat>().forEach { println(it.name) }
//    animalList.filterIsInstance<Dog>().forEach { println(it.name) }
//    animalList.filterIsInstance<Tiger>().forEach { println(it.name) }
//    animalList.filterIsInstance<DomesticAnimal>().forEach{ println(it.name) }

    // Predicates : Any, none, all
//    println("Is there any one from Kenya : ${persons.any { it.nationality=="Kenya" }}")
//    println("Is there no one from Pakistan : ${persons.none { it.nationality=="Pakistan" }}")
//    println("Wheather all are major : ${persons.all { it.age>20}}")

    // Plus / minus

    val personlist1 = listOf("Ram", "Ramesh", "Rahul","Pawan")
    val personlist2 = listOf("Gagan", "Gaurav", "Neha")
    val personAge = listOf(20,34,56,26,27,45,76)
    val personlist3 = personlist1.plus(personlist2)
//    println(personlist3)
    val personlist4 = personlist3.minus("Gaurav")
//    println(personlist4)
//    println(personlist3-personlist2)
//    println(personlist1+personAge)


    // Partition
    val list= listOf(1,2,3,4,5,6,7,8,9)
    val(even,odd)= list.partition { it%2==0 }
//    println("Even : $even")
//    println("Odd : $odd")
    // Sublist
    val sublist= listOf(2,6)
//    println(sublist)

    // Associate
    val map = persons.associateBy { it.name }
//    println(map)

    //Union and intersection
    val list1 = listOf(2,4,6,8,9)
    val list2 = listOf(1,3,5,7,9)
//    println(list1.union(list2))
//    println(list1.intersect(list2))


}