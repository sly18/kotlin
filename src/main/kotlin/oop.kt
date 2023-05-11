class darasa{
//    datamember
    private var nambari:Int=5
//    member fuction
    fun calculate():Int{
        return nambari *nambari
    }
}

fun main(args: Array<String>) {
//    this is an object
    val myobject=darasa()
    println(myobject.calculate())
//    create object
    val oblc=eMObilis()
    println(oblc.hesabu())
}
class eMObilis{
//    data member
    var num:Int=6
//    member function
    fun hesabu():Int{
        return num*num
    }
}

