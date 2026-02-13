fun main() {
//    val a = 10
//    val b = 3
//    val result = a % b
//    print("Result: $result")

    val seconds = readln().toInt()
    val hours = seconds / 3600
    val secondsForMinutes = seconds % 3600
    val minutes = secondsForMinutes / 60
    val leftseconds = secondsForMinutes % 60
    println("$hours : $minutes : $leftseconds")
}