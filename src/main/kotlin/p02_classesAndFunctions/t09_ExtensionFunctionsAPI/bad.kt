package p02_classesAndFunctions.t09_MemberExtensionFunctions.bad

class Person(val firstName: String,
             val lastName: String) {

    val fullName: String
        get() = "$firstName $lastName"
}
