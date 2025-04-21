package animal

abstract class Animal(
    private val name: String,
    private var age: Int
) {
    fun getName() = name
    fun getAge() = age
    fun setAge(age: Int) {
        this.age = age
    }

    abstract override fun toString(): String
}