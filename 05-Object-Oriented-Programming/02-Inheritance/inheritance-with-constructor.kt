open class Persons(val name: String){
   
    init{
        println("In persons class")
    }

    open fun displayDetails(){
        println("Name: $name!")
    }
}

class Students( name: String, val rollNo: Int) : Persons(name){

    init{
        println("In students class")
    }

    override fun displayDetails(){
        println("Name: $name, Roll No: $rollNo")
    }
}

fun main(){

    val obj = Students("Bhumika", 101)
    obj.displayDetails()
}