class PersonInfo {
    
    var name: String = "Unknown"
    var age: Int = 0
}

fun main() {
 
    val p = PersonInfo()
    p.name = "Bhumika"
    p.age = 23

    println("Name: ${p.name}")
    println("Age: ${p.age}")
}
