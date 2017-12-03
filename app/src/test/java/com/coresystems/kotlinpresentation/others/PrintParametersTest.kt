package com.coresystems.kotlinpresentation.others

import org.amshove.kluent.shouldEqualTo
import org.junit.Test

/**
 * Class under Test: PrintParameters
 */
class PrintParametersTest {

    @Test
    fun sayHello() {
        val parameter = PrintParameters("Tom")
        //We can't use "shouldBe" here as we're comparing Strings, so we need to use shouldEqualTo
        parameter.sayHello() shouldEqualTo "Hello Tom"
    }
}