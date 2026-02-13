import kotlin.random.Random
import kotlin.random.nextInt

fun main() {
//    val correctNumber = Random.nextInt(100)
//    var win = false
//    while (!win) {
//        print("Enter number from 0 to 100: ")
//        val number = readln().toInt()
//        if (number < correctNumber) {
//            println("Your number is lower")
//        } else if (number > correctNumber) {
//            println("Your number is higher")
//        } else {
//            win = true
//            println("Your number is correct")
//        }
    val correctAge = 18
    var isAgeTrue = false
    print("How old are you? ")
    var age = readln().toInt()
//    while (!isAgeTrue) {
//        if (age < correctAge) {
//            println("Come back in a year")
//            age++
//        } else {
//            isAgeTrue = true
//            println("Your age is suitable")
//        }
//    }
    repeat(correctAge - age) {
        println("Come back in a year")
        age++
    }
    println("Your age is suitable")
}