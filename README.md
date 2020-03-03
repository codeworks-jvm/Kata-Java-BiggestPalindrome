# Kata-Java-BiggestPalindrome
This kata is inspired from many commons palindrome exercises.

## Instructions
You have to find the first longest palindrome includes in a string.

> A palindrome is a word, number, phrase, or other sequence of characters which reads the same backward as forward, such as madam, racecar. There are also numeric palindromes, particularly date/time stamps using short digits 11/11/11 11:11 and long digits 02/02/2020. Sentence-length palindromes may be written when allowances are made for adjustments to capital letters, punctuation, and word dividers, such as "A man, a plan, a canal, Panama!", "Was it a car or a cat I saw?" or "No 'x' in Nixon".

*All input strings are only made of small letters (no capital letters, symbol, punctuation or word dividers) *
# Rules & examples
* Find the longest palindrome
  - Example : "pabba" => "abba" ('bb' is also a palindrome but not the longest)
* Find the first longest
  - Example : "abatdt"  => "aba" ('tdt' is also 3 characters long but 'aba' is the first)
* Empty string must return empty
  - Example : "" => ""
* Single character must return single character
  - Example : "a" => "a"
 
## Code
In the `src/main/java` folder, you will find the class `App` with the function ready to be implemented.

## Test it
You can use `mvn test` to test your code. If all tests pass, you won !

But first install the dependencies with `mvn clean install -DskipTests`. Thanks.

## Optimisation
Their is no limitation on the execution time, but try to be optimised :)

The difficulty of your solution can be in O(n²) or O(n), where n is the length of the string.
* O(n²) : Brute Force
* O(n) : Optimal