import org.junit.Test;
import static org.junit.Assert.*;

public class TestPalindrome {
    // You must use this palindrome, and not instantiate
    // new Palindromes, or the autograder might be upset.
    static Palindrome palindrome = new Palindrome();
    static OffByOne cc = new OffByOne();

    @Test
    public void testWordToDeque() {
        Deque d = palindrome.wordToDeque("persiflage");
        String actual = "";
        for (int i = 0; i < "persiflage".length(); i++) {
            actual += d.removeFirst();
        }
        assertEquals("persiflage", actual);
    }

    @Test
    public void testIsPalindrome() {
        assertTrue(palindrome.isPalindrome("a"));
        assertTrue(palindrome.isPalindrome(""));
        assertTrue(palindrome.isPalindrome("racecar"));
        assertTrue(palindrome.isPalindrome("bcbaaabcb"));
        assertFalse(palindrome.isPalindrome("cat"));
    }

    @Test
    public void testIsPalindromeOffByOne() {
        assertTrue(palindrome.isPalindrome("a", cc));
        assertTrue(palindrome.isPalindrome("", cc));
        assertTrue(palindrome.isPalindrome("bc", cc));
        assertFalse(palindrome.isPalindrome("cat", cc));
        assertTrue(palindrome.isPalindrome("zy", cc));
        assertFalse(palindrome.isPalindrome("zc", cc));
        assertFalse(palindrome.isPalindrome("zymotoxic", cc));
        assertFalse(palindrome.isPalindrome("racecar", cc));
    }

    @Test
    public void testIsPalindromeRecursive() {
        assertTrue(palindrome.isPalindromeRecursive("a"));
        assertTrue(palindrome.isPalindromeRecursive(""));
        assertTrue(palindrome.isPalindromeRecursive("racecar"));
        assertTrue(palindrome.isPalindromeRecursive("bcbaaabcb"));
        assertFalse(palindrome.isPalindromeRecursive("cat"));
    }
}
