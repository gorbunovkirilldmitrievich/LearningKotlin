fun main() {
//    val family = listOf<String>("John", "Nick", "Helen", "Max")
//    val john = family[0]
//    println(john)

//    val alphabet = listOf<String>("A", "B", "C", "D", "E","F")
//    val d = alphabet[3]
//    println(d)

    val daysOfMonths = listOf(31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)
    print("Enter index of month: ")
    val indexOfMonth = readln().toInt()
    if (indexOfMonth !in 1..12) {print("Incorrect index")}
    else {print(daysOfMonths[indexOfMonth-1])}
}