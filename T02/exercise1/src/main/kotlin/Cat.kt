class Cat (
    name: String,
    age: Int
): Animal(name, age) {
    override fun toString(): String {
        return "Cat name = $name, age = $age"
    }
}
