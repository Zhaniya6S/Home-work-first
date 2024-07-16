// 1 задача
import kotlin.math.pow

fun Int.pow(exponent: Int): Int {
    return this.toDouble().pow(exponent).toInt()
}

fun main() {
    val base = 2
    val exponent = 3
    val result = base.pow(exponent)
    println("$base^$exponent = $result")  // 2^3 = 8
}