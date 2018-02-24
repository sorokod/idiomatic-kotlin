package p03_stdlib.t19_FilterIsInstance.good

/**
 * Note that filterIsInstance sets the return type. filterNotNull has similar effect on the return type
 */

fun findAllStrings(objects: List<Any>): List<String> =
    objects.filterIsInstance<String>()

