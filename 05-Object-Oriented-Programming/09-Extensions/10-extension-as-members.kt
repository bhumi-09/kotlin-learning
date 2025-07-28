// Declaring Extensions as Members
// You can declare an extension inside another class or object.

class Host{

    fun talk(){
        println("Host talking..")
    }
}

class Connection{

    fun Host.listen(){
        talk()                              // this refers to Host
        println("Host listening")
    }

    fun connect(host: Host){
        host.listen()
    }
}

fun main(){
    Connection().connect(Host())
}