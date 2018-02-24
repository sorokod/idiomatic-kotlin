package p02_classesAndFunctions.t100_TODO.bad

fun condition() = true


fun someFunction(): String =
        if (condition()) {
            "something"
        } else {
            throw UnsupportedOperationException("TODO something else")
        }
