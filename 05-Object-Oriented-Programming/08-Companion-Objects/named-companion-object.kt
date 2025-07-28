class Sample{

    companion object Logger{

        fun log(msg : String){
            println("Log = $msg")
        }
    }
}

fun main(){

    Sample.log("Tested Successfully !!!")
    Sample.Logger.log("By another way tested successfully")
}