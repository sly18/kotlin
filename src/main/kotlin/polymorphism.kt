//parents/superclass
open class Shape{
    open fun draw(){
        println("Drawing a shape")
    }
}
//child/sub classes
class circle:Shape(){
    override fun draw() {
        println("Drawing a circle")
    }
}
class Square:Shape(){
    override fun draw() {
        println("Drawing a square")
    }
}
class Triangle:Shape(){
    override fun draw() {
        println("Drawing a triangle")
    }
}

fun main(args: Array<String>) {
    val shapes:Array<Shape> = arrayOf(circle(),Square(),Triangle())
    for (shape in shapes){
        shape.draw()
    }
}