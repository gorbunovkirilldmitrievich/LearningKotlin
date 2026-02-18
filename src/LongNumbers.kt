fun main() {
    val numbers = 0..1_000_000_000
    var sum: Long = 0
    for (number in numbers) {
        sum += number
    }
    println(sum)
    //    val byte: Byte = 127 //-128..127
    //    val short: Short = 32767 //-32768..32767
    //    val int: Int = 2147483647 //-2147483648..2147483647
    //    val long: Long = 9223372036854775807L //-9223372036854775808L..9223372036854775807L
}