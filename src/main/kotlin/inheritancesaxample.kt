open class Animal(colour:String, age :Int){
    init {
        println("color is :$colour.")
        println("age is :$age")
    }
}
class Dog(colour:String,age:Int):Animal(colour,age){
    fun bark(){
        println("Dog makes sound of bark")
    }
}
class cat(colour: String,age: Int):Animal(colour,age){
    fun meow(){
        println("cat makes sound of meow")
    }
}
class horse(colour: String,age: Int):Animal(colour, age){
    fun neighs(){
        println("houres makes sound of neigh")
    }
}

fun main(args: Array<String>) {
    val d=Dog("black",4)
    d.bark()
    val c=cat("white",9)
    c.meow()
    val h=horse("Brown",8)
    h.neighs()
}