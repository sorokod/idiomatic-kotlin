package p02_classesAndFunctions.t16_DataClassCopy.good

/**
 * Data classes allow smooth immutability using the copy method.
 * Note that in this case age is val and not var
 */
data class Person(val name: String, val age: Int)

fun incrementAge(person: Person): Person =
        person.copy(age = person.age + 1)
