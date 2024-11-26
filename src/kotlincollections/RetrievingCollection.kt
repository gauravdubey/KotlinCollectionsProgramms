package com.gaurav.kotlincollectionlib.collectionSample

fun main(){
    val listCities = listOf("Bangalore","Hyderabad","Chennai","Pune","Mumbai","Mangalore","Delhi","Lucknow","Jaipur","Kolkata","Ahmedabad")

    //Slice
//    println("Slice : ${listCities.slice(1..3)}}")
//    println("Slice : ${listCities.slice(0..6 step 2)}}")
//    println("Slice Setof : ${listCities.slice(setOf(1,4,6))}")
//    println("Slice listOf : ${listCities.slice(listOf(1,4,6))}")
    //Drop
//    println("Drop : ${listCities.drop(3)}}")
//    println("Drop Last: ${listCities.dropLast(3)}}")
//    println("Drop While: ${listCities.dropWhile { it.startsWith("B") }}")
//    println("Drop Last While: ${listCities.dropLastWhile { it.startsWith("J") }}")

    //Take
//    println("Take : ${listCities.take(3)}}")
//    println("Take Last: ${listCities.takeLast(3)}}")
//    println("Take While: ${listCities.takeWhile { it.startsWith("B") }}")
//    println("Take Last While: ${listCities.takeLastWhile { it.startsWith("A") }}")


    //Chunked
//    println("Chunked : ${listCities.chunked(3)}}")
//    println("Chunked Size: ${listCities.chunked(3){it.size}}")
//    println("Chunked and fold : ${listCities.chunked(3){list:List<String>->list.fold(""){acc:String,s:String -> acc+s.get(0)}}}")

    //Window
//    println("Window : ${listCities.windowed(3)}")
//    println("Window without partial and step 3 : ${listCities.windowed(3, step = 3, partialWindows = false)}}")

    /****************************** Retrieving Single Element from the collection **********************************/

    println("Element At : ${listCities.elementAt(4)}")
    println("ElementAtOrNull At : ${listCities.elementAtOrNull(15)}")
    println("ElementAtOrElse At : ${listCities.elementAtOrElse(15){"Element Not Found"}}")

    println("First Element : ${listCities.first()}")
    println("Last Element : ${listCities.last()}")
    println("First Start with 'M' : ${listCities.first{it.startsWith("M")}}")
    println("Last Start with 'M' : ${listCities.last{it.startsWith("M")}}")

    println("Find item : ${listCities.find { it.equals("Mumbai") }}")
    println("Find item with length condition : ${listCities.find { it.length>5 }}")

    println("Random item from list : ${listCities.random()}")
    println("Item contains in the list : ${listCities.contains("Mumbai")}")

}