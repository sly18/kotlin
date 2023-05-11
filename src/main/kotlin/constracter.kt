class student(val name:String,var gender:String ,val age:Int){

}

fun main(args: Array<String>) {
//    this is an object

    val myobj = student("Sylvia", "Female", 18)
    val myteam = student("Alvin", "male", 13)
    val mn = student("Sharleen", "female", 10)
    val np = student("Stephen", "male", 16)
    val mm = student("jane", "female", 13)
    val mo = student("caro", "female", 12)
    val mq = student("tash", "female", 6)
    println("Student name is ${myobj.name} and she is ${myobj.gender} of ${myobj.age} years old ")
    println("student name is ${myteam.name} and he is ${myteam.gender} of ${myteam.age} years old ")
    println("Student name is ${mn.name} and she is ${mn.gender} of ${mn.age} years old ")

}