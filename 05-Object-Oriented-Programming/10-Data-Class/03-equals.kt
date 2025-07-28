// Equality Comparison: equals()

data class StudentsInfo(val name: String, val roll: Int)

fun main() {
   
    val student1 = StudentsInfo("Anjali", 101)
    val student2 = StudentsInfo("Anjali", 101)
    val student3 = StudentsInfo("Anjali", 102)

    println("student1 == student2: ${student1 == student2}")  // true
    println("student1 == student3: ${student1 == student3}")  // false
}
