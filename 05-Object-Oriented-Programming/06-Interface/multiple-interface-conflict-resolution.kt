//  Conflict Resolution 

interface A{
    fun show(){
        println("From interface A")
    }
}

interface B{
    fun show(){
        println("From interface B")
    }
}

class C : A, B{
    
    override fun show(){
        // super.show()                    // error: multiple supertypes available. Specify the intended supertype in angle brackets, e.g. 'super<Foo>'.

        //  Must specify which one to call
        super<A>.show()
        super<B>.show()
    }
}

fun main(){

    val obj = C()
    obj.show()
}
