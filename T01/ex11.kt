import kotlin.math.abs

// Task 11. Finding the greatest common divisor of two integers

fun main() {
    while (true) {
        try {
            val input = readln().split(" ")
            val numbers = input.map { it.toInt() }
            val commonDiv = numbers[0].gcd(numbers[1])

            println(commonDiv)
            break
        } catch (e: Exception) {
            println("Couldn't parse a number. Please, try again")
        }
    }


}

// Algorithm Euclid
fun Int.gcd(other: Int): Int {
    var a = abs(this)
    var b = abs(other)
    while (b != 0) {
        val temp = b
        b = a % b
        a = temp
    }
    return a
}