//enum class DaysOfTheWeek(val day: String) {
//    SUNDAY("sun"),
//    Monday("mon"),
//    Tuesday("tues"),
//    Wednesday("wed"),
//    Thursday("thurs"),
//    Friday("fri"),
//    Saturday("sat");
//
////    fun printAll() {
////        for (enum in DaysOfTheWeek.values()) {
////            println(enum.name)
////        }
////    }
//}
//fun main() {
//
//    for (enum in DaysOfTheWeek.values()) {
//        println(enum.name)
//    }
//
//}
enum class DaysOfTheWeek() {
    SUNDAY,
    Monday,
    Tuesday,
    Wednesday,
    Thursday,
    Friday,
    Saturday;

//    fun printAll() {
//        for (enum in DaysOfTheWeek.values()) {
//            println(enum.name)
//        }
//    }
}
fun main() {

    for (enum in DaysOfTheWeek.values()) {
        println(enum.name.uppercase())
    }

}