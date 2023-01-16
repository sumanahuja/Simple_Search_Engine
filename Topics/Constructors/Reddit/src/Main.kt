class Site(val address: String, val foundationYear: Int) 
    
fun makeReddit(address: String = "reddit.com", foundationYear: Int = 2005): Site {
    return Site(address, foundationYear)
}
