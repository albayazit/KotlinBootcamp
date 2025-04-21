package animal

class Dog(
    name: String,
    age: Int
): Animal(name, age) {
    override fun toString(): String {
        return "Dog name = ${getName()}, age = ${getAge()}."
    }
}