package p02_classesAndFunctions.t16_DataClassCopy.bad

class Person(val name: String, var age: Int)

fun incrementAge(person: Person)  {
    person.age++
}
