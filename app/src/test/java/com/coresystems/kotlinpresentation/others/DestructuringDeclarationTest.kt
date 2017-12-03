package com.coresystems.kotlinpresentation.others

import org.amshove.kluent.shouldEqualTo
import org.junit.Test

/**
 * Class under test: DestructuringDeclaration
 */
class DestructuringDeclarationTest {

    @Test
    fun getPersonDestruction() {
        val person = DestructuringDeclaration.Person("Timmi", 20)
        val (destructedName, destructedAge) = getPersonDestruction(person)
        person.name shouldEqualTo destructedName
        person.age shouldEqualTo destructedAge

        //Unused variables are marked with an underscore
        val (_, age) = getPersonDestruction(person)
        person.age shouldEqualTo age
    }

    @Test
    fun destructureMaps() {
        val map = mapOf(1 to "One", 2 to "Two", 3 to "Three")

        //Destructuring key/value in a for loop
        for ((key, value) in map) {
            when (key) {
                1 -> value shouldEqualTo "One"
                2 -> value shouldEqualTo "Two"
                3 -> value shouldEqualTo "Three"
            }
        }
    }
}