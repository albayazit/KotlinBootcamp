class Dog(
    name: String,
    age: Int
) : Animal(name, age) {
    override fun toString(): String {
        return "Dog name = ${super.name}, age = $age"
    }
}