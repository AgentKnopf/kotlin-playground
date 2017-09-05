package com.coresystems.kotlinpresentation.classes

import com.coresystems.kotlinpresentation.functions.Rank.QUEEN
import com.coresystems.kotlinpresentation.functions.Suit.SPADES
import org.amshove.kluent.shouldEqual
import org.junit.Test

/**
 * Tests Infix.kt file.
 */
class InfixText {

    @Test
    fun createCard() {
        //Create a Card using the infix notation
        val card = QUEEN of SPADES
        card.rank shouldEqual QUEEN
        card.suit shouldEqual SPADES
    }
}