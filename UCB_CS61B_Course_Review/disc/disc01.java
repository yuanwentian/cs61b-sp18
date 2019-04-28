public class disc01 {
	public static int fib(int n) {
		if (n == 1 || n == 2) {
			return n - 1;
		}
		int prev = 0;
		int current = 1;
		int result = 0;
		for (int i = 2; i < n; i += 1) {
			result = prev + current;
			prev = current;
			current = result;
		}
		return result;
	}

	public static int fib_recurr(int n) {
	/** recursive method */
		if (n == 1 || n == 2) { 
			return n - 1;
		}
		return fib_recurr(n-1) + fib_recurr(n-2);
	}

	public static int fib2(int n, int k, int f0, int f1) {
		if (n == k) {
			return f0;
		} else {
			return fib2(n, k + 1, f1, f0 + f1);
		}
	}
	/** helper function method */

	public static void main(String[] args) {

		System.out.println("fib(1) = " + fib(1));
		System.out.println("fib(2) = " + fib(2));
		System.out.println("fib(3) = " + fib(3));
		System.out.println("fib(4) = " + fib(4));
		System.out.println("fib(1) = " + fib_recurr(1));
		System.out.println("fib(2) = " + fib_recurr(2));
		System.out.println("fib(3) = " + fib_recurr(3));
		System.out.println("fib(4) = " + fib_recurr(4));
		System.out.println("fib2(4) = " + fib2(4, 1, 0, 1));
	}


}