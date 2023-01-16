fun stringToMap(first: String, second: String, third: String): Map<String, Int> {
    val values = mapOf<String, Int>(first to first.length, second to second.length, third to third.length)
    return values
}
