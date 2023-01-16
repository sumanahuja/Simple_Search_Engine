fun main() {
    // put your code here
    val letter= readln()
    for (i in 'a'.. 'z') {
        if (i.code < letter[0].code) {
            print(i)
        }
        else return
    }
}