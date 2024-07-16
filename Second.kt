// 2 задача
import kotlin.math.pow

fun Int.pow(exponent: Int, resultHandler: (Int) -> Unit) {
    val result = this.toDouble().pow(exponent).toInt()
    resultHandler(result)
}

fun main() {
    val base = 2
    val exponent = 3

    base.pow(exponent) { result ->
        println("$base^$exponent = $result")  // Output: 2^3 = 8
    }
}