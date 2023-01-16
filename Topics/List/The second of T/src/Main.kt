fun solution(names: List<String>): Int {
    var loc = 0
    for (n in 1 until names.size step 2) {
        if(names[n].first().toString() == "T") {
            loc = n
            break
        }
    }
    return loc
}