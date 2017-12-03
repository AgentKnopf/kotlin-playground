package com.coresystems.kotlinpresentation.classes

/**
 * Brief overview over sealed classes. Reference: https://kotlinlang.org/docs/reference/sealed-classes.html
 */
sealed class Fruit

data class Apple(val type: String) : Fruit()
data class Banana(val origin: String) : Fruit()

/**
 * Uses "when" as a statement.
 */
fun eatFruit(fruit: Fruit) {
    when (fruit) {
        is Apple -> print("Eating an Apple")
        is Banana -> print("Eating a Banana")
    }
}

/**
 * When using when as an expression we must cover all possible subclasses of "Fruit" or add an else to cover the remainder.
 */
fun getPopularity(fruit: Fruit): Int = when (fruit) {
    is Apple -> 10
    is Banana -> 5
}