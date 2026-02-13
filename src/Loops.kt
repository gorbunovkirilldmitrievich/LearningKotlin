fun main() {
    val names = listOf("John", "Mike", "Nick", "Helen", "Alex", "Emma")
    print("Enter name: ")
    val searchName = readln()
    var nameFound = false
//    var index = 0
//    while (index < names.size) {
//        if (searchName == names[index]) {
//            nameFound = true
//            break
//        }
//        index++
//    }
    for (name in names) {
        if (searchName == name) {
            nameFound = true
            break
        }
    }
    println("$nameFound")
}