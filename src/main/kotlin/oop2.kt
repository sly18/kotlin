class fruits{
    val num:Int=3
    fun count():Int{
       return num
    }
}


fun main(args: Array<String>) {
//    this is an object
    val frui=fruits()
    println(frui.count())
}