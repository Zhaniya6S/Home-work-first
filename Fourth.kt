// 4 задача
sealed class DataType {
    data class DoubleType(val value: Double) : DataType()
    object UnitType : DataType()
}

inline fun <reified T> T.displayTypeInfo() {
    when (this) {
        is String -> println("это String")
        is Int -> println("это Int")
        else -> println("тип у $this неизвестен")
    }
}

fun DataType.displayTypeInfo() {
    when (this) {
        is DataType.DoubleType -> println("это DoubleType со значением ${this.value}")
        is DataType.UnitType -> println("это Unit")
    }
}

fun main() {
    3.displayTypeInfo()  // Int
    "a".displayTypeInfo()  // String
    true.displayTypeInfo()  // тип у true неизвестен

    val doubleType = DataType.DoubleType(1.4)
    doubleType.displayTypeInfo()  // DoubleType со значением 1.4

    val unitType = DataType.UnitType
    unitType.displayTypeInfo()  // Unit
}
