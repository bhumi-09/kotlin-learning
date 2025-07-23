// field is a special keyword that refers to the actual backing field.
// field is used to store the actual value.
// field is used inside custom getter/setter to avoid recursion.


class UserInfo{

    var userName : String = "Guest"

    get(){
        println("Getting value")
        return field
    }

    set(value){
        println("Setting value")
        field = value.uppercase()
    }
}

fun main(){

    val obj = UserInfo()
    println(obj.userName)

    obj.userName = "Bhumika"
    println(obj.userName)
}

