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
                pets.add(Dog(petName, petAge))
            }
            "cat" -> {
                val petName = readln()
                val petAge = readPetAge() ?: continue
                pets.add(Cat(petName, petAge))
            }
            "hamster" -> {
                val petName = readln()
                val petAge = readPetAge() ?: continue
                pets.add(Hamster(petName, petAge))
            }
            "guinea" -> {
                val petName = readln()
                val petAge = readPetAge() ?: continue
                pets.add(GuineaPig(petName, petAge))
            }
            else -> println("Incorrect input. Unsupported pet type")
        }
    }
    return pets
}

fun printPets(pets: List<Animal>) {
    for (pet in pets) {
        if (pet is Herbivore) {
            println(pet)
        }
    }
    for (pet in pets) {
        if (pet is Omnivore) {
            println(pet)
        }
    }
}

fun readPetAge(): Int? {
    val petAge = readln().toIntOrNull()
    if (petAge == null || petAge <= 0) {
        println("Incorrect input. Age <= 0")
        return null
    }
    return petAge
}