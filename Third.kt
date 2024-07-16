// 3 задача
inline fun <reified T> T.typeInfo() {
    when (T::class) {
        String::class -> println("это String")
        Int::class -> println("это Int")
        else -> println("тип у $this неизвестен")
    }
}

fun main() {
    val str = "Hello"
    val num = 42
    val list = listOf(1, 2, 3)

    str.typeInfo()  // String
    num.typeInfo()  // Int
    list.typeInfo() // Неизвестный тип
}