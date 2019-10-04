package com.myolnir;

import com.myolnir.Palindrome;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {

    private Palindrome palindrome;
    private String input;

    @Before
    public void setUp() {

        input = null;
        palindrome = new Palindrome();

    }

    @After
    public void tearDown() {

    }

    @Test(expected = NullPointerException.class)
    public void nullStringTest() {

        palindrome.isPalindrome(null);

    }

    @Test
    public void emptyStringTest() {

        input = "";

        assertTrue(palindrome.isPalindrome(input));

    }

    @Test
    public void multipleWhiteSpaceTest() {

        input = "A   Santa         at Nasa";

        assertTrue(palindrome.isPalindrome(input));

    }

    @Test
    public void singleCharTest() {

        input = "H";

        assertTrue(palindrome.isPalindrome(input));

    }

    @Test
    public void punctuationTest() {

        input = "Angel, do you want a beer?";

        assertFalse(palindrome.isPalindrome(input));

    }
    

    @Test
    public void alphaNumericPalindromeTest() {

        input = "Air 2 an a2ria";

        assertTrue(palindrome.isPalindrome(input));
    }

    @Test
    public void validPalindromeTest() {

        input = "No lemon no melon";

        assertTrue(palindrome.isPalindrome(input));
    }

    @Test
    public void invalidPalindromeTest() {

        input = "This is a test";

        assertFalse(palindrome.isPalindrome(input));
    }
}