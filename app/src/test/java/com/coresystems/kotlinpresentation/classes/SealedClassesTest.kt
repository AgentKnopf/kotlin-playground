package com.coresystems.kotlinpresentation.classes

import org.amshove.kluent.shouldBe
import org.junit.Test

/**
 * Class under test: SealedClasses.
 */
class SealedClassesTest {

    @Test
    fun eatFruit() {
        val banana = Banana("Peru")
        val apple = Apple("Granny Smith")

        eatFruit(banana)
        eatFruit(apple)
    }

    @Test
    fun getPopularity() {
        val banana = Banana("Peru")
        val apple = Apple("Granny Smith")

        getPopularity(banana) shouldBe 5
        getPopularity(apple) shouldBe 10
    }
}