fun names(namesList: List<String>): List<String> {
    // var count = 0
    var temp: String
    val nameCount = mutableListOf<String>()
    val list2 = namesList.distinct()
    for (i in list2.indices) {
        temp = list2[i]
        var count = 0
        for (n in i until namesList.size) {
            if (temp == namesList[n] ){
                count++
            }
        }
        nameCount.add("\"The name ${list2[i]} is repeated $count times\"")
    }
    return nameCount
}


//fun main () {
//   val list = names(listOf("Vasya", "Olga", "Vasya", "Dima", "Masha", "Vasa", "Olga"))
//    for (l in list) {
//        println(l)
//    }
//}