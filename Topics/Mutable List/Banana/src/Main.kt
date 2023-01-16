fun solution(strings: MutableList<String>, str: String): MutableList<String> {
    for (s in strings.indices) {
    //    println(strings.size)
        if( strings[s] == str) {
  //          println("REPLACE")
            strings[s] = "Banana"
        }
    }
//    println(strings.toString())

    return strings
}

//fun main() {
//    val mList = mutableListOf("Sometimes", "you", "have", "to", "shake", "up", "your life")
//    val str = "shake"
//    val newList = solution(mList,str)
//    println(newList.toString())
//}