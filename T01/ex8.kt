import java.util.Scanner

// Task 8. Ordered sequence in ascending order

fun main() {
    val scanner = Scanner(System.`in`)

    var previousNumber: Int? = null
    var hasDigit = false
    var currentIndex = 0

    while (scanner.hasNext()) {
        if (!scanner.hasNextInt()) break
        val currentNumber = scanner.nextInt()
        if (previousNumber != null && currentNumber < previousNumber) {
            println("The sequence is not ordered from the ordinal number of the number $currentIndex")
            return
        }
        currentIndex++
        hasDigit = true
        previousNumber = currentNumber
    }

    if (!hasDigit) {
        println("Input error")
    } else {
        println("The sequence is ordered in ascending order")
    }
}