package com.coresystems.kotlinpresentation.functions

import org.amshove.kluent.shouldBe
import org.amshove.kluent.shouldBeGreaterThan
import org.junit.Test

/**
 * Tests Extensions.kt
 */
class ExtensionsAndOperatorTest {
    @Test
    fun filterBy() {
        //The type "Collection" is inferred in this case, so we can leave it out
        val basket = createConsumableBasket()
        basket.filterBy(Type.VEGETABLE).size shouldBe 2
        basket.filterBy(Type.FRUIT).size shouldBe 3
    }

    @Test
    fun removeOddNumbers() {
        //Once again the type is inferred - so we don't explicitly state it
        val evenList = listOf(1, 5, 6, 9, 10, 3, 54, 33, 2).removeOddNumbers()
        assert(evenList.containsAll(listOf(6, 10, 54, 2)))
        evenList.size shouldBe 4
    }

    @Test
    fun addAmount() {
        val basket = createConsumableBasket()
        //Let's add 100 to each of our elements, then for sure we should end up with every count being > 100
        for (consumable in basket.addAmount(100)) {
            consumable.count shouldBeGreaterThan 100
        }
    }

    /**
     * It's pretty crazy :) - it basically looks like we're calling Consumable + 23 - but in fact
     * we're calling an overloaded operator. And it only works because we did overload the operator.
     * If we remove the operator overloading function, this call here will not compile.
     * Also - this is another extension function.
     */
    fun Collection<Consumable>.addAmount(amount: Int) = map { value -> value + amount }
}