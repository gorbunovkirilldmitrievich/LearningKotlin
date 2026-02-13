fun main() {
//    print("The weather is good? true or false: ")
//    val isGoodWeather = readln().toBoolean()
//    print("What time is it? ")
//    val time = readln().toInt()
//    val isDay = time in 5..22
//    if (isDay && isGoodWeather) {
//        println("Go for a walk")
//    } else if (isDay && !isGoodWeather) {
//        println("Go to read book")
//    } else{
//        println("Go to sleep")
//    }
    print("Write your balance: ")
    val balance = readln().toInt()
    print("Are you hangry? true/false ")
    val isHungry = readln().toBoolean()
    if (isHungry && balance>500){
        print("Buy pizze")
    } else if (isHungry && balance < 500){
        print("Buy some instant noodles")
    } else if (!isHungry && balance > 500){
        print("Go to the cinema")
    } else if (!isHungry && balance < 500){
        print("Go for a walk")
    }
}