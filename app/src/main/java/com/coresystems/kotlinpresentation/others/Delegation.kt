package com.coresystems.kotlinpresentation.others

/**
 * Explains the concept of delegation: https://kotlinlang.org/docs/reference/delegation.html
 */
interface Base {
    fun returnText(): String
}

class BaseImplementation(val text: String) : Base {
    override fun returnText(): String = text

}

/**
 * The delegation instance owns an instance of type Base and forwards any requests to that instance. This avoids
 * having to wrap all method calls to the base instance in the Dervied class.
 */
class Derived(base: Base) : Base by base