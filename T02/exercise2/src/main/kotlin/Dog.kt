import kotlin.math.round

class Dog(
    name: String,
    age: Int,
    weight: Double
): Animal(name, age, weight) {
    override fun getFeedInfoKg(): Double {
        return round(weight * 0.3 * 100) / 100
    }

    override fun toString(): String {
        return "Dog name = $name, age = $age, mass = ${"%.2f".format(weight)}, feed = ${"%.2f".format(getFeedInfoKg())}"
    }
}