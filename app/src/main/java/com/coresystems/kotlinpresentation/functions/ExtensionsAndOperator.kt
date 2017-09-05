package com.coresystems.kotlinpresentation.functions

/**
 * Extension functions are useful when we need to provide some general-purpose functionality on a type that we don't own:
 * https://kotlinlang.org/docs/reference/extensions.html
 */
data class Consumable(val name: String, val type: Type, var count: Int = 1) {
    /**
     * Overriding the plus operator allows us to add an Int to our object. More
     * details on operator overloading: https://kotlinlang.org/docs/reference/operator-overloading.html
     */
    operator fun plus(amount: Int): Consumable = this.copy(count = count.plus(amount))
}

enum class Type {
    FRUIT, VEGETABLE
}

/**
 * Illustrates how we can easily construct collections.
 */
fun createConsumableBasket(): Collection<Consumable> {
    return listOf(Consumable("Apple", Type.FRUIT, 10),
            Consumable("Banana", Type.FRUIT, 12),
            Consumable("Tomato", Type.VEGETABLE, 3),
            Consumable("Cucumber", Type.VEGETABLE, 21),
            Consumable("Melon", Type.FRUIT, 7))
}

/**
 * This is an extension function for our consumable class. Of course we could simply make it a member function, but
 * the point is to illustrate that this is possible > define methods for a given class, outside of that class.
 */
fun Collection<Consumable>.filterBy(type: Type): Collection<Consumable> = filter { it.type.equals(type) }

/**
 * This is an example for defining an extension function for a type we don't own: Keep only the even elements.
 */
fun Collection<Int>.removeOddNumbers() = filter { it.rem(2) == 0 }