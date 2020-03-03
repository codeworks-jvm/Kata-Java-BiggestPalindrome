package com.codeworks.kata;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        System.out.println( "Some sample tests" );

        // Case 1 : 'abba'
        final String expectedCase1 = "abba";
        final String returnCase1 = findBiggestPalindrome("abba");
        System.out.println(String.format(
                "Case 1 : 'abba' => %s ! return '%s' expected '%s'",
                expectedCase1.equals(returnCase1) ? "SUCCESS" : "FAILED", returnCase1, expectedCase1
        ));

        // Case 2 : 'a'
        final String expectedCase2 = "a";
        final String returnCase2 = findBiggestPalindrome("a");
        System.out.println(String.format(
                "Case 2 : 'abba' => %s ! return '%s' expected '%s'",
                expectedCase2.equals(returnCase2) ? "SUCCESS" : "FAILED", returnCase2, expectedCase2
        ));

        // Case 3 : 'paba'
        final String expectedCase3 = "aba";
        final String returnCase3 = findBiggestPalindrome("paba");
        System.out.println(String.format(
                "Case 3 : 'paba' => %s ! return '%s' expected '%s'",
                expectedCase3.equals(returnCase3) ? "SUCCESS" : "FAILED", returnCase3, expectedCase3
        ));

    }

    public static String findBiggestPalindrome(String s) {
        // TODO : implement code here
        return "";
    }
}
