fun main() {
//    val countOfApples: Float = 10.0f
//    val countOfPeople: Float = 4.0f
//    val result = countOfApples / countOfPeople
//    println(result)

//    print("Enter first number: ")
//    val firstNumber = readln().toInt()
//    print("Enter second number: ")
//    val secondNumber = readln().toInt()
//    print("Enter third number: ")
//    val thirdNumber = readln().toInt()
//    val result = (firstNumber + secondNumber + thirdNumber) / 3
//    println("The result is $result")

    print("Enter first number: ")
    val firstNumber = readln().toDouble()
    print("Enter second number: ")
    val secondNumber = readln().toDouble()
    print("Enter operation(+ - / *): ")
    val operation = readln()
    if (operation == "+") {print("Result: ${firstNumber + secondNumber}")}
    if (operation == "-") {print("Result: ${firstNumber - secondNumber}")}
    if (operation == "/") {print("Result: ${firstNumber / secondNumber}")}
    if (operation == "*") {print("Result: ${firstNumber * secondNumber}")}
}