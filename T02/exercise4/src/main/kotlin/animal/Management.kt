package animal

fun main() {
    val pets = mutableListOf<Animal>()
    val petCount = readln().toIntOrNull() ?: return println("Couldn't parse a number. Please, try again")

    generateSequence {
        if (pets.size < petCount) {
            val type = readln().lowercase()
            when (type) {
                "dog", "cat" -> {
                    val name = readln()
                    val age = readln().toIntOrNull()
                    if (age == null) {
                        println("")
                    } else if (age <= 0) {
                        println("Incorrect input. Age <= 0")
                    } else {
                        val pet = when (type) {
                            "dog" -> Dog(name, age)
                            "cat" -> Cat(name, age)
                            else -> null
                        }
                        pet?.let { pets.add(it)}
                    }
                }
                else -> println("Incorrect input. Unsupported pet type")
            }
        } else null
    }.take(petCount).toList()

    pets.asSequence()
        .filter { it.getAge() > 10 }
        .forEach { it.setAge(it.getAge() + 1) }

    pets.asSequence()
        .forEach(::println)

}