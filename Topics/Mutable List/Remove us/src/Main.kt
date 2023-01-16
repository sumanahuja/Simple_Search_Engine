fun solution(elements: MutableList<String>, index: Int): MutableList<String> {
    for (e in elements.indices ) {
        if(index == e)
        elements.removeAt(index)
    }
    //println(elements.toString())
    return elements
}
//fun main() {
//    solution("a b c d".split(" ") as MutableList<String>,2)
//}