// Abstract Class with Constructor

abstract class Course(val courseName: String){

    abstract fun getDuration(): Int

    fun showCourseName(){
        println("Course Name: $courseName")
    }
}

class KotlinCourse (courseName : String) : Course(courseName){

    override fun getDuration() : Int = 40
}

fun main(){

    val courseObj = KotlinCourse("Kotlin for Beginners")
    courseObj.showCourseName()
    println("Duration: ${courseObj.getDuration()} days")
}


  
