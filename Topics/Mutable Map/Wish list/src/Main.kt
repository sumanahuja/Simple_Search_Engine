fun makeMyWishList(wishList: Map<String, Int>, limit: Int): MutableMap<String, Int> {
    val newMap = mutableMapOf<String, Int>()
    for (w in wishList) {
        if (w.value <= limit) {
            newMap.put(w.key, w.value)
        }
    }
    return newMap
}