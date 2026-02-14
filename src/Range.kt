fun main() {
//    val numbers = 0..<1000 step 10
//    for (number in numbers) {
//        println(number)
//    }
    print("Enter your number: ")
    val inputNumber = readln().toInt()
    val evenNumbers = 0..1000 step 2
    if (inputNumber in evenNumbers) {
        print("Your number is even")
    } else {
        print("Your number is not even")
    }
}