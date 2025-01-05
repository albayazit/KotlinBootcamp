
// Task 9. Filtering rows

fun main() {
    val foundedWords = mutableListOf<String>()
    var input = mutableListOf<String>()

    val size = readln().toIntOrNull()
    if (size == null) {
        println("Input error")
        return
    }
    repeat(size) {
        val word = readln()
        input.add(word)
    }
    val wordPattern = readln()

    for (word in input) {
        if (wordPattern in word) {
            foundedWords.add(word)
        }
    }

    println(foundedWords.joinToString(", "))
}