// Top-Level Extension Function (Global Scope)
// This extension is available everywhere in the file (or in other files if imported).

fun String.greet(): String {
    return "Hello, $this"
}

fun main() {
    val name = "Bhumika"
    println(name.greet())  
}
