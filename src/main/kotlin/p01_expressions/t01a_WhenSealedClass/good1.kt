package p01_expressions.t01a_WhenSealedClass.good1

sealed class Result

object Success : Result()
class Failure(val message: String) : Result()

fun handleResult(result: Result) {
    when (result) {
        is Success -> println("OK!")
        is Failure -> println("Failed: ${result.message}")
    }
}

fun main(args: Array<String>) {
    handleResult(Success)
    handleResult(Failure("oh"))
}