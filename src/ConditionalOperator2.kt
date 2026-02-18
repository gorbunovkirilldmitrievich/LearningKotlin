fun main() {
//    val index = readln().toInt()
////    val month = when (index) {
////        1 -> "January"
////        2 -> "February"
////        3 -> "March"
////        4 -> "April"
////        5 -> "May"
////        6 -> "June"
////        7 -> "July"
////        8 -> "August"
////        9 -> "September"
////        10 -> "October"
////        11 -> "November"
////        12 -> "December"
////        else -> ""
////    }
//    val month = when (index) {
//        1,2,3 -> "January"
//        4 -> "April"
//        5 -> "May"
//        6 -> "June"
//        7 -> "July"
//        8 -> "August"
//        9 -> "September"
//        10 -> "October"
//        11 -> "November"
//        12 -> "December"
//        else -> ""
//    }
//
//    if (index in 1..12) {
//        println("You entered $index which corresponds to the month of $month")
//    } else {
//        println("You entered $index. There is no month with such an index")
//    }

    val index = readln().toInt()
    val season = when (index) {
        1,2,12 -> "winter"
        3,4,5 -> "spring"
        6,7,8 -> "summer"
        9,10,11 -> "autumn"
        else -> ""
    }
    println("Season is: $season. Index: $index")
}