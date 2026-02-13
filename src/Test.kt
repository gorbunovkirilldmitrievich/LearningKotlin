fun main() {
    val inputNumber = readln().toInt()
    var changeableNumber = 1
    var sumOfNumbers = 0
    while (changeableNumber <= inputNumber) {
        sumOfNumbers += changeableNumber
        changeableNumber++
    }
    println("Сумма чисел от 1 до $inputNumber равна $sumOfNumbers")
}