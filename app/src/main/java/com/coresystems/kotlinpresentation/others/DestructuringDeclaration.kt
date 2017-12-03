package com.coresystems.kotlinpresentation.others

/**
 * More details here: https://kotlinlang.org/docs/reference/multi-declarations.html
 */
fun getPersonDestruction(person: DestructuringDeclaration.Person): DestructuringDeclaration.Person = DestructuringDeclaration.Person(person.name, person.age)

class DestructuringDeclaration {

    data class Person(val name: String, val age: Int)

}