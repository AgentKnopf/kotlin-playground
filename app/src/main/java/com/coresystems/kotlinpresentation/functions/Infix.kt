package com.coresystems.kotlinpresentation.functions

/**
 * Covers various kinds of functions from here https://kotlinlang.org/docs/reference/functions.html
 */
enum class Suit {
    HEARTS,
    SPADES,
    CLUBS,
    DIAMONDS
}

enum class Rank {
    TWO, THREE, FOUR, FIVE,
    SIX, SEVEN, EIGHT, NINE,
    TEN, JACK, QUEEN, KING, ACE;

    /**
     * Infix function that can be used like this: Rand of Suit = Card
     */
    infix fun of(suit: Suit) = Card(this, suit)
}

data class Card(val rank: Rank, val suit: Suit)