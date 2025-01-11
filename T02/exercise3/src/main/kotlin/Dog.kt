class Dog(
    name: String,
    age: Int,
): Animal(name, age), Omnivore {
    override fun hunt(): String {
        return "I can hunt for robbers"
    }

    override fun toString(): String {
        return "Dog name = $name, age = ${age}. " + hunt()
    }
}