import kotlin.system.exitProcess

// Task 4. Finding the arithmetic mean of negative numbers

fun main() {
    val numbers = getInput()
    val negativeNumbers = mutableListOf<Int>()
    for (num in numbers) {
        if (num < 0) {
            negativeNumbers.add(num)
        }
    }
    if (negativeNumbers.isEmpty()) {
        println("There are no negative elements")
    } else {
        println(calculateArithmeticMean(negativeNumbers))
    }
}

fun calculateArithmeticMean(negativeElements: List<Int>): String {
    val average = negativeElements.sum() / negativeElements.size
    return average.toString()
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
            for (ch in input) {
                numbers.add(ch.toInt())
            }
            return numbers
        } catch (e: Exception) {
            println("Couldn\'t parse a number. Please, try again")
        }
    }
    return numbers
}