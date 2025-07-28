//  also define properties (read-only) as extensions.
//  Extension properties cannot have backing fields, so you can't store values.

val String.firstChar: Char
    get() = this[0]

fun main() {
  
    println("Bhumika".firstChar)  // Output: B
    println("shejwal".firstChar)  // Output: s
}