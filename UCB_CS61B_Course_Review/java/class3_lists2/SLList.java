/** An SLList is a list of integers, which hides the terrible truth of the nakeness within. */

public class SLList {

	/** Nested class */
	private static class IntNode {
		public int item;
		public IntNode next;
		public IntNode(int i, IntNode n) {
			item = i;
			next = n;
		}
	}

	/* the first item (if it exists) is at sentinel.next. */
	private IntNode sentinel;
	private int size;

	/** Creates an empty SLLists. */
	public SLList() {
		sentinel = new IntNode(63, null);
		size = 0;
	}

	public SLList(int x) {
		sentinel = new IntNode(63, null);
		sentinel.next = new IntNode(x, null);
		size = 1;
	}

	/** Adds x to the front of the list */
	public void addFirst(int x) {
		sentinel.next = new IntNode(x, sentinel.next);
		size += 1;
	}

	public int getFirst() {
		return sentinel.next.item;
	}

	/** Adds an item to the end of the list recursively */
/**	public void addLast(int x) {
		if (first.next == null) {
			first.next = new IntNode(x, null);
		} else {
			IntNode p = first;
			first = first.next;
			addLast(x);
			first = p;
		}
	}
*/
	public void addLast(int x) {
		size += 1;
		/** you don't need this special case if you use sentinel node */
		/** if (first == null) {
			first = new IntNode(x, null);
			return;
		} */

		IntNode p = sentinel;
		while (p.next != null) {
			p = p.next;
		}
		p.next = new IntNode(x, null);

	}

	/** get the size of SLList */
/**	public int size() {
		if (first.next == null) {
			return 1;
		} else {
			IntNode p = first;
			first = first.next;
			int count = 1 + size();
			first = p;
			return count;
		}
	}
*/

/** if you want to do size the recursive way , Here is what you may want to do */
/**
	public int size() {
		return size(first);
	}

	private static int size(IntNode p) {
		if (p.next == null) {
			return 1;
		}
		return 1 + size(p.next);
	}
*/

/** 	public int size() {
		IntNode p = first;
		int count = 1;
		while (p.next != null) {
			count += 1;
			p = p.next;
		}
		return count;
	}
*/

	/** size using caching */
	public int size() {
		return size;
	}

	public static void main(String[] args) {
		/** Creates as list of one integer, namely 10 */
		SLList L = new SLList(15);
		L.addFirst(10);
		L.addFirst(5);
		System.out.println("L.getFirst() derives " + L.getFirst());
		System.out.println("L.size() derives " + L.size());
		L.addLast(20);
		System.out.println("L.size() derives " + L.size() + " after L.addLast(20)");
		System.out.println("L sentinel item is " + L.sentinel.item);
		System.out.println("L 1st item is " + L.sentinel.next.item);
		System.out.println("L 2st item is " + L.sentinel.next.next.item);
		System.out.println("L 2st next is " + L.sentinel.next.next.next);
		System.out.println("L 3st item is " + L.sentinel.next.next.next.item);
		System.out.println("L 3st next is " + L.sentinel.next.next.next.next);
		System.out.println("L 4st item is " + L.sentinel.next.next.next.next.item);
		System.out.println("L 4st next is " + L.sentinel.next.next.next.next.next);
	}
}
