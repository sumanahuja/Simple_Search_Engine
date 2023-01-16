package search

import java.io.File

fun ALL(searchItem: MutableList<String>, personList: List<String>, mutableMap: MutableMap<String, String>, outputList1: MutableList<String>) {

        var outputList = outputList1
        //var sum:String=""
        for (s in searchItem.indices ) {
            for (i in mutableMap) {

                if (i.key.contains(searchItem[s], ignoreCase = true) && i.key.length==searchItem[s].length) {
                    //print(i.key)
                    //println(" ${searchItem[s]}")
                    //println(i.value)
                    if(i.value.contains(","))
                    outputList += (i.value.split(", ").toMutableList())
                    else outputList.add(i.value)

                    outputList= outputList.distinct() as MutableList<String>
                  //  println(outputList.toString())
                }
            }
        }
        if (outputList.isEmpty())
            println("No matching people found.")
       // else println("${outputList.size} persons found")
        var new: Int = -1
        var newList = mutableListOf<Int>()
        for (j in outputList.indices) {
            //  if (outputList.distinct().size == 1)

            for (s in searchItem) {
                if (!personList[outputList[j].toInt()].contains(s , ignoreCase = true)) {
                    break
                }
                new = j
            }

            if (new != -1) {
                // println("${new+1} person found:")
                newList.add(outputList[new].toInt())
                // println("${personList[outputList[new].toInt()]}")
                //GlobalData.COUNT ++
            }
        }
    if (newList.size >0) {
        println("${newList.distinct().size} persons found")
        for (n in newList.distinct()) {
            println("${personList[n]}")

        }
    }

    }
fun ANY(searchItem: MutableList<String>, personList: List<String>, mutableMap: MutableMap<String, String>, outputList1: MutableList<String>) : MutableList<Int> {
    var outputList =outputList1
    for (s in searchItem) {
        //println(s)
        for (mapItem in mutableMap) {
            // println(mapItem.key)
            if (mapItem.key.contains(s, ignoreCase = true)) { //print("Imem Found ${i.key}")
                //   println("${GlobalData.personList[mapItem.key.toInt()]}")//.contains(${searchItem})")
                //for (p in GlobalData.personList){
                outputList.add( mapItem.value)
                // println(outputList.toString())
            }
        }
    }
    if (outputList.isEmpty())
        println("No matching people found.")
    //  else println("${outputList.size} persons found")
     val new1= mutableListOf<Int>()
     var k=0
    for (j in outputList) {
        //  println(j.toString().split(",").size)
        if (j.toString().split(",").size > 1)
        {
            for (i in j.toString().split(",")){
                // println(i)
             //   println("${personList[i.trim().toInt()]}")
                new1.add(k++, i.trim().toInt())
            }
        } else
           // println("${personList[outputList[outputList.indexOf(j)].toInt()]}")
            new1.add(k++, outputList[outputList.indexOf(j)].toInt())

    }

    return new1
}
fun takePrint(m :MutableList<Int>,personList: List<String>) {
    println("${m.size-1} person found:")

    for (i in m.distinct()) {
        println("${personList[i]}")

    }
}

fun NONE(searchItem: MutableList<String>, personList: List<String>, mutableMap: MutableMap<String, String>, outputList1: MutableList<String>) {

    val new = ANY(searchItem,personList,mutableMap,outputList1)
    val newList =  mutableListOf<String>()

    for (n in new)
        newList.add(personList[n])

    val v = personList - newList
    println("${v.size} persons found")
    for(i in v) {
        println(i)
    }
}
//Users/puneetahuja/IdeaProjects/Simple Search Engine/Simple Search Engine/task/src/search
fun main(args:Array<String>) {
    var personList = listOf<String>()
    var mutableMap = mutableMapOf<String, String>()

    if (args.contains("--data")) {

  //   personList = File("/Users/puneetahuja/IdeaProjects/Simple Search Engine/Simple Search Engine/task/src/search/file.txt").readLines()
        personList = File(args.last()).readLines()

    }
    for (p in personList) {
        for (i in p.split(" ")) {
            if (mutableMap.contains(i)) {
                mutableMap += mapOf(i to ("${mutableMap.get(i)}, ${personList.indexOf(p)}"))

            } else {
                mutableMap += mapOf(i to personList.indexOf(p).toString())
            }
        }
    }
   // println(GlobalData.mutableMap.toString())

    var choice = "1"

    while (choice != "0") {
        println("\n=== Menu ===")
        println("1. Find a person")
        println("2. Print all people")
        println("0. Exit")

        choice = readln()
        when (choice) {
            "1" -> {
                println("Select a matching strategy: ALL, ANY, NONE")
                val choice = readln()
                var outputList = mutableListOf<String>()
                println("Enter data to search people:")
                val searchItem = readln().split(" ").toMutableList()
                var searchWholeString = ""
                for (s in searchItem) {
                    searchWholeString = "$searchWholeString $s"
                }

                if (choice == "all".uppercase()) {

                    ALL(searchItem,personList, mutableMap, outputList)
                    continue

                } else if(choice == "any".uppercase()) {

                    val list =ANY(searchItem,personList, mutableMap, outputList)
                    takePrint(list,personList)
                    continue

                } else if (choice == "none".uppercase()) {

                    NONE(searchItem,personList, mutableMap, outputList)
                    continue
                }
            }

            "2" -> {
                println("${personList.size} persons found:")
                for (i in 0 until personList.size) {
                    //print("${i+1}. ")
                    println(personList[i])

                }
                continue

            }

            "0" -> {
                println("Bye!")
                return
            }

            else -> println("Incorrect option! Try again.")
        }
    }
}