import kotlin.system.exitProcess

// Task 5. Finding numbers that have the same first and last digits

fun main() {
    val numbers = getInput()
    if (numbers.isEmpty()) {
        println("There are no such elements")
        return
    }
    println(numbers.joinToString(" "))
}


fun getInput(): MutableList<Int> {
    val numbers = mutableListOf<Int>()
    while (true) {
        try {
            val num = readln().toInt()
            if (num <= 0) {
                println("Input error. Size <= 0")
                exitProcess(1)
            }
            val input = readln().split(" ")
            if (input.size != num) {
                throw Exception()
            }
            for (ch in input) {
                if (ch.first() == ch.last()) {
                    numbers.add(ch.toInt())
                }
            }
            return numbers
        } catch (e: Exception) {
            println("Couldn\'t parse a number. Please, try again")
        }
    }
}