// Secondary constructors are declared inside the class body using constructor keyword.

class Book(val title: String){

    var author: String = "Unknown"

    //Secondary constructor
    constructor(title: String, author: String) : this(title){
        this.author = author
        println("In secondary constructor")
    }

    fun showBookDetails(){
        
        println("Book name: $title, Author: $author")
    }
}

fun main(){

    val bookObj1 = Book("Kotlin Basics")
    val bookObj2 = Book("Advanced Kotlin", "JetBrains")

    bookObj1.showBookDetails()
    bookObj2.showBookDetails()
}