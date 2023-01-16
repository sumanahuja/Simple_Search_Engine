fun solution(strings: List<String>, str: String): Int {
    var count = 0
    for (s in strings) {
        if (s == str) {
            count++
        }
    }
    return count
}