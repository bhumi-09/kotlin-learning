// Private – Accessible only inside the file/class:

class PrivateMoifier{

    private fun secret(){
        println("this is private function")
    }

    fun accessSecret(){
        println("this is access secret function")
        secret()                               // Accessible within the class
    }
}

fun main(){

    val obj = PrivateMoifier()
    obj.accessSecret()
    // obj.secret()                             ERROR ->  Cannot access 'secret': it is private in 'PrivateMoifier'                 
}