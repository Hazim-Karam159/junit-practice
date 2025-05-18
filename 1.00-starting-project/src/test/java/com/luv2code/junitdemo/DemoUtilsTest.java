package com.luv2code.junitdemo;


import jdk.jfr.Enabled;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.*;

/*
 1. **Without Static Import:** You would need to write assertions like this:
 like   Assertions.assertEquals(expected, actual);
*/

/*
 1. **With Static Import:** You can write assertions more cleanly like this:

 assertEquals(expected, actual);
*/

import static org.junit.jupiter.api.Assertions.*;


@DisplayNameGeneration(DisplayNameGenerator.Simple.class)
@TestMethodOrder(MethodOrderer.DisplayName.class)
class DemoUtilsTest {

    // set up
    DemoUtils demoUtils ;
    @BeforeEach
    void setUpBeforeEach() {
        demoUtils = new DemoUtils();
        System.out.println("@BeforeEach - executing once before each test method in this class.");
    }
//
//    @AfterEach
//    void tearDownAfterEach() {
//        System.out.println("@AfterEach - executing once after each test method in this class.");
//        System.out.println();
//    }
//
//    // @BeforeAll & @AfterAll => must be static
//
//    @BeforeAll
//   static void setUpBeforeAll() {
//
//        System.out.println("@BeforeAll - executing once before All.");
//    }
//
//    @AfterAll
//    static void tearDownAfterAll() {
//        System.out.println("@AfterAll - executing once after All.");
//        System.out.println();
//    }

    @Test
    @DisplayName("Test Equals and Not Equals")
    void testEqualsAndNotEquals(){

        System.out.println("Running test: testEqualsAndNotEquals()");

        assertEquals(6, demoUtils.add(2, 4), "2 + 4 should equal 6");
        assertNotEquals(6, demoUtils.add(2, 5), "2 + 5 must not be 6");
    }

    @Test
    @DisplayName("Test Null and Not Null")
    void testNullAndNotNull(){

        System.out.println("Running test: testNullAndNotNull()");

        String str1 = null;
        String str2 = "Zoma";

        assertNull(demoUtils.checkNull(str1), "Object should be null");
        assertNotNull(demoUtils.checkNull(str2), "object should not be null");
    }

    @Test
    @DisplayName("Test Same and Not Same")
    void testSameAndNotSame(){
        System.out.println("Running test: testSameAndNotSame()");
        String str1 = "Zoma";

        assertSame(demoUtils.getAcademy(), demoUtils.getAcademyDuplicate(), "Strings should be the same");
        assertNotSame(str1, demoUtils.getAcademy(), "Strings should not be the same");
    }

    @Test
    @DisplayName("Test Is Greater Than or Not")
    @Disabled("This test is disabled until we fix the bug!")

    void testIsGreaterThanOrNot(){
        System.out.println("Running test: testIsGreaterThanOrNot()");
        assertTrue(demoUtils.isGreater(10, 5), "10 is greater than 5");
        assertFalse(demoUtils.isGreater(5, 10), "5 is not greater than 10");
    }

    @Test
    @DisplayName("Test Throws and Does Not Throw")
//    @Disabled("This test is disabled until we fix the bug!")
//    @EnabledOnJre(JRE.JAVA_21)
    @EnabledForJreRange(min = JRE.JAVA_17, max = JRE.JAVA_21)  
    void testThrowsAndDoesNotThrow() throws Exception{
        System.out.println("Running test: testThrowsAndDoesNotThrow()");

        assertThrows(Exception.class, () -> demoUtils.throwException(-1), "Should throw exception");

        assertDoesNotThrow(() -> demoUtils.throwException(10), "Should not throw exception");
    }

    @Test
    @DisplayName("Test Multiply")
    @EnabledOnOs(OS.MAC)
    void testMultiply(){
        assertEquals(12, demoUtils.multiply(3,4), "4 * 3 must be 12");
    }

}
