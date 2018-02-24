package p02_classesAndFunctions.t100_TODO.good

fun condition() = true


fun someFunction(): String =
        if (condition()) {
            "something"
        } else {
            TODO("TODO something else")
        }
