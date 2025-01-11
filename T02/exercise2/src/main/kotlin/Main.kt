fun main() {
    while (true) {
        val petsCount = readln().toIntOrNull()
        if (petsCount == null || petsCount <= 0) {
            println("Couldn't parse a number. Please, try again")
            continue
        }
        val pets = getPetsList(petsCount)
        printPets(pets)
        break
    }
}

fun getPetsList(animalCount: Int): List<Animal> {
    val pets = mutableListOf<Animal>()
    for (i in 0..< animalCount) {
        when (readln().trim()) {
            "dog" -> {
                val petName = readln()
                val petAge = readPetAge() ?: continue
                val feedCount = readPetFeed() ?: continue
                pets.add(Dog(petName, petAge, feedCount))
            }
            "cat" -> {
                val petName = readln()
                val petAge = readPetAge() ?: continue
                val feedCount = readPetFeed() ?: continue
                pets.add(Cat(petName, petAge, feedCount))
            }
            else -> println("Incorrect input. Unsupported pet type")
        }
    }
    return pets
}

fun printPets(pets: List<Animal>) {
    for (pet in pets) {
        println(pet)
    }
}

fun readPetFeed(): Double? {
    val feedCount = readln().toDoubleOrNull()
    if (feedCount == null || feedCount <= 0) {
        println("Incorrect input. Mass <= 0")
        return null
    }
    return feedCount
}

fun readPetAge(): Int? {
    val petAge = readln().toIntOrNull()
    if (petAge == null || petAge <= 0) {
        println("Incorrect input. Age <= 0")
        return null
    }
    return petAge
}