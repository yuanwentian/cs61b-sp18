public class IntList {
	public int first;
	public IntList rest;
	/** IntList constructor */
	public IntList(int f, IntList r) {
		this.first = f;
		this.rest = r;
	}

	/** Return the size of the IntList */
	public int size() {
		if (this.rest == null) return 1;
		return 1 + this.rest.size();
	}

	/** Return the ith item in the IntList */
	public int get(int i) {
		if (i > this.size()) {
			System.out.println("i is bigger than the size of the list.");
			return 0;
		}
		if (i == 0) {
			return this.first; 
		} else {
			return this.rest.get(i-1);
		}
	}

	/** using main method as testing tool */
	public static void main(String[] args) {
		IntList L = new IntList(5, null);
		L = new IntList(10, L);
		L = new IntList(15, L);
		System.out.println(L.size());
		System.out.println(L.get(0));
		System.out.println(L.get(1));
		System.out.println(L.get(2));
	}
}
