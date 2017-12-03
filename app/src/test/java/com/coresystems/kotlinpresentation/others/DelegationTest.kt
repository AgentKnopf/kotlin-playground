package com.coresystems.kotlinpresentation.others

import org.amshove.kluent.shouldEqualTo
import org.junit.Test

/**
 * File under test: Delegation
 */
class DelegationTest {

    @Test
    fun returnText() {
        val base = BaseImplementation("Backpack")
        Derived(base).returnText() shouldEqualTo base.text
    }
}
