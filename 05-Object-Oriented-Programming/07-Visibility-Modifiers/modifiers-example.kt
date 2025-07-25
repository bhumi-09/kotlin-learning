
open class Users(private val id: Int, internal val name: String) {

    protected fun getProtectedInfo(): String {
        return "Protected Info of $name"
    }

    public fun showInfo() {
        println("User Info: ID is hidden, Name is $name")
    }

    private fun privateDetail(): String {
        return "Private Detail: ID = $id"
    }

    fun accessPrivateDetail(): String {
        return privateDetail()                      //  private used inside the class
    }
}

class Admin(id: Int, name: String) : Users(id, name) {
    fun showProtectedData() {
        println(getProtectedInfo())                 //  protected accessible in subclass
    }
}

fun main() {
    val user = Users(1, "Bhumika")
    user.showInfo()                                 //  public
    println(user.name)                              //  internal (works within same module)

    val admin = Admin(2, "Admin")
    admin.showProtectedData()                       //  accesses protected method

    println(user.accessPrivateDetail())             //  access to private via public wrapper

    // println(user.id)                             // Error -> private - Not accessible
    // println(user.getProtectedInfo())             // Erros -> protected - Not accessible outside subclass
}
