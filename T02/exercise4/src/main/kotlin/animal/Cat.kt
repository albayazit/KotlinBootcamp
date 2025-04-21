package animal

class Cat(
    name: String,
    age: Int
): Animal(name, age) {
    override fun toString(): String {
        return "Cat name = ${getName()}, age = ${getAge()}."
    }
}