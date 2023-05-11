open class wazazi{
    val mama="She loves cooking"
    val baba="so much of an interprenure"
}
class boy:wazazi(){
    fun mvulana(){
        println(baba)
    }
}
class girl:wazazi(){
    fun msichana(){
       println(mama)
    }
}

fun main(args: Array<String>) {
    val obj=boy()
    obj.mvulana()
    val mn=girl()
    mn.msichana()
}