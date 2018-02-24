package p03_stdlib.t17_CoerceIn.good

/**
 * Ranges.kt also contains coerceAtMost and coerceAtLeast extension functions on integral types
 */
fun updateProgress(value: Int) {
    val actualValue = value.coerceIn(0, 100)
}
