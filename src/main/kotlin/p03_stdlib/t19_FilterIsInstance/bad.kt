package p03_stdlib.t19_FilterIsInstance.bad

fun findAllStrings(objects: List<Any>): List<Any> =
    objects.filter { it is String }
