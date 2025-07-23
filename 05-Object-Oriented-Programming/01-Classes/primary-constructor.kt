// Primary constructor is part of class header
// Initializes main properties and works with init block


class PersonDetails(val name: String = "", val age: Int){        //constructor parameters 

    fun introduce(){                                             //member function of the clas
        println("Hii, I'm $name! and I'm $age years old. ")
    }
}

fun main(){

    val personDetailsObj = PersonDetails("Bhumika", 23)
    personDetailsObj.introduce()
}