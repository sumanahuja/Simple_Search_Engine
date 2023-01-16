fun main() {
    val word = readln()
    for (i in 'a'..'z') {
        if(word.contains(i)) {
        continue
        }
        else print(i)
    }
}