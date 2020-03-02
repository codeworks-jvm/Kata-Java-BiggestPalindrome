package com.codeworks.kata;

import junit.framework.TestCase;
import java.util.Date;

public class AppTest extends TestCase {
    final Date start = new Date();

    public AppTest( String testName ) {
        super( testName );
    }

    public void test_simple_1() {
        assertEquals("abba",  App.findBiggestPalindrome("abba"));
    }

    public void test_simple_2() {
        assertEquals("aba",  App.findBiggestPalindrome("aba"));
    }

    public void test_simple_3() {
        assertEquals("a",  App.findBiggestPalindrome("ab"));
    }
}


