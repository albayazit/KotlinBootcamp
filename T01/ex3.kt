import kotlin.system.exitProcess

// Task 3. Finding the Fibonacci number

fun main() {
    val num = getInput()
    val result = calculateFibonacci(num)
    println(result)
}

fun getInput(): Int {
    while (true) {
        try {
            val num = readln().toInt()
            if (num > 46) {
                throw StackOverflowError("Overflow")
            }
            return num
        } catch (e: StackOverflowError) {
            println("Too large n")
            exitProcess(1)
        } catch (e: Exception) {
            println("Couldn\'t parse a number. Please, try again")
        }
    }
}

// calculating using memoization
fun calculateFibonacci(num: Int, memo: MutableMap<Int, Int> = mutableMapOf()): Int {
    if (num <= 1) return num
    if (memo.containsKey(num)) return memo[num]!!
    val result = (calculateFibonacci(num - 1, memo) + calculateFibonacci(num - 2, memo))
    memo[num] = result
    return result
}
