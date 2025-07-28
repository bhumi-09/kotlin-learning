// copy() Function

data class Books(val title: String, val author: String)

fun main(){

    val originalBook = Books("Kotlin Programming", "JetBrains")

    // Create a copy with modified property
    val updatedBook = originalBook.copy(title = "Advanced Kotlin")

    println("Original Book: $originalBook")
    println("Updated Book: $updatedBook")
}