import kotlin.math.pow
import kotlin.math.sqrt

// Task 1. Finding the perimeter of a triangle

fun main() {
    while (true) {
        try {
            val x1 = readln().toDouble()
            val y1 = readln().toDouble()
            val x2 = readln().toDouble()
            val y2 = readln().toDouble()
            val x3 = readln().toDouble()
            val y3 = readln().toDouble()

            if ((x2 - x1) * (y3 - y1) == (y2 - y1) * (x3 - x1)) {
                println("It's not a triangle")
            } else {
                println("Perimeter: ${"%.3f".format(getPerimeter(x1, y1, x2, y2, x3, y3))}")
            }
            break
        } catch (e: Exception) {
            println("Couldn\'t parse a number. Please, try again")
        }
    }
}

fun getPerimeter(x1: Double, y1: Double, x2: Double, y2: Double, x3: Double, y3: Double): Double {
    val firstSide = sqrt((x2 - x1).pow(2) + (y2 - y1).pow(2))
    val secondSide = sqrt((x3 - x2).pow(2) + (y3 - y2).pow(2))
    val thirdSide = sqrt((x1 - x3).pow(2) + (y1 - y3).pow(2))

    return firstSide + secondSide + thirdSide
}