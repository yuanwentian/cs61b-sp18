import static org.junit.Assert.*;
import org.junit.Test;

public class ArrayDequeTest {

    public static boolean checkEmpty(boolean expected, boolean actual) {
        if (expected != actual) {
            System.out.println("isEmpty() returned " + actual + ", but expected: " + expected);
            return false;
        }
        return true;
    }

    /* Utility method for printing out empty checks. */
    public static boolean checkSize(int expected, int actual) {
        if (expected != actual) {
            System.out.println("size() returned " + actual + ", but expected: " + expected);
            return false;
        }
        return true;
    }

    /* Prints a nice message based on whether a test passed.
     * The \n means newline. */
    public static void printTestStatus(boolean passed) {
        if (passed) {
            System.out.println("Test passed!\n");
        } else {
            System.out.println("Test failed!\n");
        }
    }


    public static void addFirstLastTest() {
        System.out.println("Running addFirstLast test.");
        ArrayDeque<String> ad1 = new ArrayDeque<String>();
        boolean passed = checkEmpty(true, ad1.isEmpty());
        ad1.addFirst("front");
        // The && operator is the same as "and" in Python.
        // It's a binary operator that returns true if both arguments true, and false otherwise.
        passed = checkSize(1, ad1.size()) && passed;
        passed = checkEmpty(false, ad1.isEmpty()) && passed;
        ad1.addLast("last");
        passed = checkSize(2, ad1.size()) && passed;
        System.out.println("Printing out deque: ");
        ad1.printDeque();
        printTestStatus(passed);
    }

    public static void removeFirstLastTest() {
        System.out.println("Running removeFirstLast test.");
        ArrayDeque<String> ad1 = new ArrayDeque<String>();
        boolean passed = checkEmpty(true, ad1.isEmpty());
        ad1.addFirst("middle");
        ad1.addFirst("front");
        ad1.addLast("last");
        System.out.println("The original Deque: (should be 'front middle last')");
        ad1.printDeque();
        passed = checkSize(3, ad1.size()) && passed;
        passed = checkEmpty(false, ad1.isEmpty()) && passed;
        ad1.removeFirst();
        ad1.removeLast();
        System.out.println("Printing out deque: (should be 'middle ')");
        ad1.printDeque();
        passed = checkSize(1, ad1.size()) && passed;
        passed = checkEmpty(false, ad1.isEmpty()) && passed;
        ad1.removeLast();
        passed = checkSize(0, ad1.size()) && passed;
        passed = checkEmpty(true, ad1.isEmpty()) && passed;
        printTestStatus(passed);
    }


    public static void getTest() {
        System.out.println("Running get test.");
        ArrayDeque<String> ad1 = new ArrayDeque<String>();
        boolean passed = checkEmpty(true, ad1.isEmpty());
        ad1.addFirst("middle");
        ad1.addFirst("front");
        ad1.addLast("last");
        System.out.println("The original Deque: (should be 'front middle last')");
        ad1.printDeque();
        String a = ad1.get(0);
        String b = ad1.get(1);
        String c = ad1.get(2);
        assertEquals("front", a);
        assertEquals("middle", b);
        assertEquals("last", c);
        passed = checkSize(3, ad1.size()) && passed;
        passed = checkEmpty(false, ad1.isEmpty()) && passed;
        printTestStatus(passed);
    }


    public static void main(String[] args) {
        System.out.println("Running tests.\n");
        addFirstLastTest();
        removeFirstLastTest();
        getTest();

    }
}
