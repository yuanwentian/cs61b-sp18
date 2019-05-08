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


}
