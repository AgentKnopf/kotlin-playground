package com.coresystems.kotlinpresentation.classes

/**
 * Related to: https://kotlinlang.org/docs/reference/classes.html
 */

fun createPerson() = Person("Tina")

/**
 * Since animal has a private constructor, we can't create an instance of it. It is "private in" the Animal class.
 */
//TODO fun createAnimal() = Animal("Timmi")

/**
 * Explicit primary constructor with default visibility.
 */
class Person constructor(name: String, age: Int = 20)

/**
 * Explicit primary constructor with visibility modifier.
 */
class Animal private constructor(name: String)

/**
 * If the constructor has no visibility modifier we don't need the prefix "constructor".
 */
class Produce(name: String)

/**
 * Primary constructors do not contain any code! Use an init block for those cases.
 * Constructor parameters are just that - parameters, they're only accessible during initialization.
 */
class Vegetable(name: String, yearOfHarvest: Int = 2018) {
    /**
     * Kotlin supports operator overloading: https://kotlinlang.org/docs/reference/operator-overloading.html
     * and custom infix operations
     */
    val nameAndYear: String = name.plus(yearOfHarvest)
    //This is a property - we can later access it by name
    val name = name
    val year = yearOfHarvest

    //An initialize block > if you need to initialize in your primary constructor
    init {
        //We can refer to variables from within a string
        print("Initializing $name, $yearOfHarvest, $nameAndYear")
        //We can also evaluate expressions and print the result
        print("Initializing ${name.plus(yearOfHarvest)}")
    }
}