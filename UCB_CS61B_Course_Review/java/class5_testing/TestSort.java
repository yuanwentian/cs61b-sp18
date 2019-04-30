/** Tests the the Sort class. */
public class TestSort {
	/** Test the Sort.sort method. */
	public static void testSort() {
		String[] input = {"i", "have", "an", "egg"};
		String[] expected = {"an", "egg", "have", "i"};
		Sort.sort(input);

		/** the following is wrong 
		if (input != expected) {
			System.out.println("Error! There seems to be a probelm with Sort.sort.");
		}
		*/

		/** an Ad-Hoc Testing Method: correct but less explainable method
		for (int i = 0; i < input.length; i += 1) {
			if (!input[i].equals(expected[i])) {
				System.out.println("Mismatch in position " + i + ", expected: " + expected[i] + ", but got: " + input[i]);
			}
		}
		*/

		/** another Ad-Hoc Testing Method: correct but less explainable method
		if (!java.util.Arrays.equals(input, expected)) {
			System.out.println("Error! There seems to be a probelm with Sort.sort.");
		}
		*/

		org.junit.Assert.assertArrayEquals(expected, input);
	}
	public static void main(String[] args) {
		testSort();
	}
}