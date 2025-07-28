// hashCode() Demonstration

data class Employees(val id: Int, val name: String)

fun main() {
    val emp1 = Employees(1, "Raj")
    val emp2 = Employees(1, "Raj")

    println("Hashcode of emp1: ${emp1.hashCode()}")
    println("Hashcode of emp2: ${emp2.hashCode()}")
}


// Give same hashcode because properties are equals