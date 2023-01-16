fun main() {
    val n = readln().toInt()
    var i = 0
    var j = 0
    var count = 0
    while (i < n + 1) {
        for (j in 1..i) {
            print("$i ")
            count++
            if (count == n) break
        }
        if (count == n) break
        i++

    }
}
