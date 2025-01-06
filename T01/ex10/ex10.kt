
// Task 10. Searching for adult usernames

fun main() {
    val userCount = readln().toIntOrNull()
    if (userCount == null) {
        println("Couldn't parse a number. Please, try again")
        return
    }
    val users = mutableListOf<User>()

    repeat(userCount) {
        val name = readln()
        val age = readln().toIntOrNull()
        if (age == null) {
            println("Couldn't parse a number. Please, try again")
            return
        } else if (age <= 0) {
            println("Incorrect input. Age <= 0")
        }
        users.add(User(name, age))
    }

    println((users.asSequence()
        .filter { it.age >= 18 }
        .map { it.name }).joinToString(", "))
}
