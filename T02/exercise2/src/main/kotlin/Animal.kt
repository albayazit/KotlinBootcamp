abstract class Animal(
    protected val name: String,
    protected val age: Int,
    protected val weight: Double
) {
    abstract fun getFeedInfoKg(): Double
}