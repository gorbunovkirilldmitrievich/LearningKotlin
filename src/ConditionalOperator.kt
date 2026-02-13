import com.sun.org.apache.xalan.internal.lib.ExsltMath.power

fun main() {
   print("Please enter the temperature: ")
   val temperature = readln().toInt()
   if (temperature > 25) {println("temperature > 25")}
   else if (temperature in 20..25) {println("temperature in 20..25")}
   else {println("temperature < 20")}

//    print("Please enter age first person: ")
//    val firstAge = readln().toInt()
//    print("Please enter age second person: ")
//    val secondAge = readln().toInt()
//    if (firstAge > secondAge) {
//        println("The first person has to be greater ${firstAge-secondAge} than the second person")
//    } else if (firstAge < secondAge) {println("The second person has to be greater ${secondAge - firstAge} than the first person")}
//    else {println("The first person is the same age as the second person")}
}