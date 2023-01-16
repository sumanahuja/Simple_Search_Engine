fun main() {
    var num: Int = 1
    var sum = 0
    do {
        num = readln().toInt()
        sum += num

    } while (num != 0)
    println(sum)
}
