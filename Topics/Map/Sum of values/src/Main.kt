fun summator(map: Map<Int, Int>): Int {
    var sum: Int = 0
    for (m in map) {
        if (m.key % 2 == 0) {
            sum += m.value
        }
    }
    return sum
}