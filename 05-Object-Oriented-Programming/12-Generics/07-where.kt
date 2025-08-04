// where – Type Constraints for multiple bounds
// Used when you want to apply multiple constraints to a generic type.


fun <T> printLength(item: T) where T : CharSequence, T : Comparable<T> {
    println("Length: ${item.length}")
}

fun main() {
    printLength("Hello")  // ✅ String is CharSequence & Comparable
    // printLength(123)    Error: Int doesn't satisfy both constraints
}
