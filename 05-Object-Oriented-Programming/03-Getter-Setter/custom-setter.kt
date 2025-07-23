// var → getter and setter

class Student{

    var marks: Int = 0

    set(value){
        
        if(value in 0..100){
            field = value                           // field -> update internal value.
        }else{
            println("Marks must be between 0 and 100")
        }
    }
}

fun main(){
    val s = Student()
    s.marks = 85
    println("Marks: ${s.marks}")

    s.marks = 100
    println("Updated Marks: ${s.marks}")
}
