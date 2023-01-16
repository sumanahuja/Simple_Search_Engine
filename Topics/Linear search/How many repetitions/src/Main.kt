import java.io.File

// write your code here

fun main(args: Array<String>) {
  val fileName = "/Users/puneetahuja/IdeaProjects/Simple Search Engine/Topics/Linear search/How many repetitions/data/dataset/input.txt"
  var count = 0
  if(File(fileName).exists()) {
    val lines = File(fileName).readText()
    //println(lines)
    val item = lines[0]
    for (n in 0 until lines.length) {
      if(item == lines[n]) {
       // println("${lines[n]}  $n")
        count++
      }
    }
    println(count-1)
  } else println("FILE NOT FOUND")
}

