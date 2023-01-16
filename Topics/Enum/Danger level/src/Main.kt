enum class DangerLevel(val level: Int) {
    HIGH(3),
    MEDIUM(2),
    LOW(1);

    internal fun getLevel(): Int {
        return this.level
    }

}
fun main() {
    val high = DangerLevel.HIGH
    val medium = DangerLevel.MEDIUM
    println(high.getLevel() > medium.getLevel())
}
