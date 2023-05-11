fun main(args: Array<String>) {
    print("enter first number:")
    val num1= readLine()?.toDouble()?:0.0
    print("enter the second number")
    val num2= readLine()?.toDouble()?:0.0
    print("enter operator(+,-,*,/")
    val op= readln()
    val majibu =when(op){
        "+"-> num1+num2
        "-"-> num1-num2
        "*"-> num1*num2
        "/"-> num1/num2

        else ->{
            println("invalid operator")
            0.0
        }
    }
    println("$num1 $op $num2=$majibu")
}