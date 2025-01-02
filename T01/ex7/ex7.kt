import java.io.File
import kotlin.system.exitProcess

// Task 7. Finding the maximum and minimum values

fun main() {
    val content = getInput()
    val values = checkData(content)
    val size = content[0].toInt()
    val (min, max) = findMinMax(values)
    if (!isValidSize(size, values.size)) return
    printResults(size, values, min, max)
    writeFile("$min $max")
}

fun printResults(size: Int, values: MutableList<Double>, min: Double, max: Double) {
    println("$size\n${values.joinToString(" ")}\nSaving min and max values in file")
}

fun findMinMax(values: MutableList<Double>): Pair<Double, Double> {
    var min = values[0]
    var max = values[0]
    for (value in values) {
        if (value > max) max = value
        if (value < min) min = value
    }
    return min to max
}

fun isValidSize(size: Int, valuesSize: Int): Boolean {
    return when {
        size <= 0 -> {
            println("Input error. Size <= 0")
            false
        }
        size != valuesSize -> {
            println("Input error. Insufficient number of elements")
            false
        }
        else -> true
    }
}

fun checkData(content: List<String>): MutableList<Double> {
    val values: MutableList<Double> = mutableListOf()
    for (i in 1 until content.size) {
        if (content[i].toDoubleOrNull() != null)
            values.add(content[i].toDouble())
    }
    return values
}

fun getInput(): List<String> {
    val data = File(readln())
    if (!data.exists()) {
        println("Input error. File isn't exist")
        exitProcess(1)
    }
    return data.readText().split("\n", " ")
}

fun writeFile(values: String) {
    val file = File("result.txt")
    file.appendText(values)
    file.appendText("\n")
}