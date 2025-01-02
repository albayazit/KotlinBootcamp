import kotlin.system.exitProcess

// Task 6. Sorting a collection by selection

fun main() {
    val listOfNumbers = getInput()
    selectionSort(listOfNumbers)
    println(listOfNumbers.joinToString(" "))
}

fun selectionSort(arr: MutableList<Double>) {
    for (i in arr.indices) {
        var minIndex = i
        for (j in i until arr.size) {
            if (arr[j] < arr[minIndex]) {
                minIndex = j
            }
        }
        if (minIndex != i) {
            val temp = arr[i]
            arr[i] = arr[minIndex]
            arr[minIndex] = temp
        }
    }
}

fun getInput(): MutableList<Double> {
    while (true) {
        try {
            val size = readln().toInt()
            if (size <= 0) {
                println("Input error. Size <= 0")
                exitProcess(1)
            }
            val numbers = readln().split(" ").map { it.toDouble() }
            if (numbers.size != size) {
                throw Exception()
            }
            return numbers.toMutableList()
        } catch (e: Exception) {
            println("Couldn\'t parse a number. Please, try again")
        }
    }
}