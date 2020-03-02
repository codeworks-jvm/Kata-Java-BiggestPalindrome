package com.codeworks.kata;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );

        // Case 1 : 'abba'
        final String expectedCase1 = "abba";
        final String returnCase1 = findBiggestPalindrome("abba");
        System.out.println(String.format(
                "Case 1 : 'abba' => %s return '%s' expected 'abba'",
                "", findBiggestPalindrome("abba")
        ));

    }

    public static String findBiggestPalindrome(String s) {
        // TODO : implement code here
        return "";
    }
}
