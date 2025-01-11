class Cat (
    name: String,
    age: Int
): Animal(name, age), Omnivore {
    override fun hunt(): String {
        return "I can hunt for mice"
    }

    override fun toString(): String {
        return "Cat name = $name, age = ${age}. " + hunt()
    }
}
