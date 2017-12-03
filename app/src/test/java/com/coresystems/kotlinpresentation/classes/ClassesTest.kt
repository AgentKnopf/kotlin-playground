package com.coresystems.kotlinpresentation.classes

import org.amshove.kluent.shouldBeInRange
import org.amshove.kluent.shouldEqual
import org.amshove.kluent.shouldNotBeLessOrEqualTo
import org.junit.Test

/**
 * Tests Classes.kt file.
 */
class ClassesTest {

    /* TODO the following way of naming methods is currently not supported on Android
    fun `create Method`(){

    }
    */

    @Test
    fun createFruit() {
        //If default values are specified for constructor parameters, you can omit those in your call
        Person("Till")
        //We can specify parameters by name and pass them in a different order
        val fruit = Vegetable(yearOfHarvest = 2019, name = "Lily")
        //We can use Kluent for fluent assertions (works via infix operator)
        //This is the same using assertEquals, but in a more natural way (human language wise)
        fruit.name shouldEqual "Lily"
        //TODO currently the following is not supported in Android: fruit.year `should not equal to` 0
        fruit.year shouldNotBeLessOrEqualTo 0
        //Here we assert that a given value is in a given range
        fruit.year shouldBeInRange 1..2020
        fruit.nameAndYear shouldEqual "${fruit.name}${fruit.year}"
    }
}