package com.coresystems.kotlinpresentation.classes

/**
 * Kotlin can have top-level private classes:
 */
private class TopLevelPrivateClass {
    //Yes this is possible, unlike in Java which can not have a top-level private class
}

class PublicClass {
    private val privateClass = TopLevelPrivateClass()
    private val nestedPrivateClass = NestedPrivateClass()

    /*
    The following won't compile, as PublicClass can not access NestedPrivateClass's privateName variable (since
    it's private):
    fun getPrivateName() = nestedPrivateClass.privateName
     */

    //You can also have nested private classes just like in java
    private class NestedPrivateClass(private val privateName: String = "Tina")
}