
// Task 2. Finding hours, minutes and seconds

fun main() {
    val seconds = getInput()
    if (seconds < 0) {
        output("Incorrect time")
    } else {
        output(getTimeUsingSeconds(seconds))
    }
}

fun getInput(): Int {
    while (true) {
        try {
            return readln().toInt()
        } catch (e: Exception) {
            println("Couldn\'t parse a number. Please, try again")
        }
    }
}

fun getTimeUsingSeconds(totalSeconds: Int): String {
    val hours = totalSeconds / 3600
    val minutes = (totalSeconds % 3600) / 60
    val seconds = totalSeconds % 60
    return String.format("%02d:%02d:%02d", hours, minutes, seconds)
}

fun output(result: String) {
    println(result)
}