package com.coresystems.kotlinpresentation.functions;

import org.junit.Test;

import static com.coresystems.kotlinpresentation.functions.StaticFunctionsAndFieldsKt.FILE_LEVE_CONSTANT;
import static org.junit.Assert.assertEquals;

/**
 * This test is in Java to illustrate Java/Kotlin interop.
 */
public class ClassWithStaticFieldsTest {

    @Test
    public void staticFields() {
        //Since we annotated the field with @JvmField we can access just like we would in Java
        assertEquals(ClassWithStaticFields.JVM_ANNOTATED_FIELD, "Hello World");
        /*
        The following does not compile, since SOME_STATIC_FIELD is considered to be final:
        ClassWithStaticContent.SOME_STATIC_FIELD = "Timmi";
         */

        //Is marked as "const" and can be accessed the same was as the one marked with @JvmField, but the bytecode
        // differs
        assertEquals(ClassWithStaticFields.CONST_FIELD, 123456);

        //Next up we got the file-level declared constant, we can import it directly or...
        assertEquals(FILE_LEVE_CONSTANT, "Foo");
        //... us it with it's file name prepended:
        assertEquals(StaticFunctionsAndFieldsKt.FILE_LEVE_CONSTANT, "Foo");
    }

    @Test
    public void staticFunctions() {
        //We can access this directly, no need to call ClassWithStaticMethod.Companion...
        assertEquals(ClassWithStaticMethod.someStaticMethod(), "Hello");

        //This one is not annotated with @JvmStatic, thus we're taking a detour via the companion object
        assertEquals(ClassWithStaticMethod.Companion.somOtherMethod(), "No");

        //This one is a package-level functions:
        assertEquals(StaticFunctionsAndFieldsKt.packageLevelFunction(), "Top");
    }
}
