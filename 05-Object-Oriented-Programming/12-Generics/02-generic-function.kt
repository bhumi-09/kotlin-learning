
// A generic function that prints any type of item

fun <T> printItem(item: T) {
    println("Item: $item")
}

fun main() {
    printItem(100)
    printItem("Generics in Kotlin")
    printItem(3.14)
}
