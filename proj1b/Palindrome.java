public class Palindrome {

    /**
     * Given a String, wordToDeque method returns a Deque
     * where the characters appear in the same order as
     * in the String.
     */
    public Deque<Character> wordToDeque(String word) {
        ArrayDeque resultDeque = new ArrayDeque();
        resultDeque.resize(word.length());
        for (int i = 0; i < word.length(); i += 1) {
            Character ithCharacter = word.charAt(i);//get the ith character in the word string
            resultDeque.addLast(ithCharacter);
        }
        return resultDeque;
    }

    /**
     * Notes:
     * 1. Any word of length 1 or 0 is a palindrome.
     * 2. ‘A’ and ‘a’ should not be considered equal.
     */
    public boolean isPalindrome(String word) {
        boolean result = true;
        Deque<Character> wordDeque = wordToDeque(word);
        for (int i = 0; i < wordDeque.size()/2; i++) {
            Character a = wordDeque.removeFirst();
            Character b = wordDeque.removeLast();
            if (a != b) {
                result = false;
            }
        }
        return result;
    }

    public boolean isPalindrome(String word, CharacterComparator cc) {
        boolean result = true;
        Deque<Character> wordDeque = wordToDeque(word);
        for (int i = 0; i < wordDeque.size()/2; i++) {
            Character a = wordDeque.removeFirst();
            Character b = wordDeque.removeLast();
            if (!cc.equalChars(a, b)) {
                result = false;
            }
        }
        return result;
    }


    public boolean isPalindromeRecursive(String word) {
        Deque<Character> wordDeque = wordToDeque(word);
        return isPalindromeRecursiveHelper(wordDeque);
    }

    private boolean isPalindromeRecursiveHelper(Deque<Character> d) {
        if (d.size() == 0 || d.size() == 1) {
            return true;
        } else {
            Character a = d.removeFirst();
            Character b = d.removeLast();
            return (a == b) && isPalindromeRecursiveHelper(d);
        }
    }

}
