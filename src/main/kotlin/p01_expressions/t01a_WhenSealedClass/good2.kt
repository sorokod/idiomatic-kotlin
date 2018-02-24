package p01_expressions.t01a_WhenSealedClass.good2

sealed class Maybe<out T> {
    object None : Maybe<Nothing>()
    data class Just<out T>(val value: T) : Maybe<T>()
}

fun <T> handleResult(maybe: Maybe<T>) {
    when (maybe) {
        Maybe.None -> println("None")
        is Maybe.Just -> println("Just: ${maybe.value}")
    }
}

fun main(args: Array<String>) {
    handleResult(Maybe.None)
    handleResult(Maybe.Just(7))
}