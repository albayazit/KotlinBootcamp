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

fun printPets(pets: List<Animal>) {
    for (pet in pets) {
        println(pet)
    }
}

fun getPetsList(animalCount: Int): List<Animal> {
    val pets = mutableListOf<Animal>()
    repeat(animalCount) {
        when (readln().trim()) {
            "dog" -> {
                val petName = readln()
                val petAge = readPetAge()
                if (petAge != null) {
                    pets.add(Dog(petName, petAge))
                }
            }
            "cat" -> {
                val petName = readln()
                val petAge = readPetAge()
                if (petAge != null) {
                    pets.add(Cat(petName, petAge))
                }
            }
            else -> println("Incorrect input. Unsupported pet type")

        }
    }
    return pets
}


fun readPetAge(): Int? {
    val petAge = readln().toIntOrNull()
    if (petAge == null || petAge <= 0) {
        println("Incorrect input. Age <=0")
        return null
    }
    return petAge
}