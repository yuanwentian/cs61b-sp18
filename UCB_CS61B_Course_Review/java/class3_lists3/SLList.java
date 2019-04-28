/** An SLList is a list of integers, which hides the terrible truth
  * of the nakeness within. */

public class SLList<LochNess> {
	/** Nested class */
	private class StuffNode {
		public LochNess item;
		public StuffNode next;
		public StuffNode(LochNess i, StuffNode n) {
			item = i;
			next = n;
		}
	}

	/* the first item (if it exists) is at first. */
	private StuffNode first;
	private int size;


	public SLList(LochNess x) {
		first = new StuffNode(x, null);
		size = 1;
	}

	/** Adds x to the front of the list */
	public void addFirst(LochNess x) {
		first = new StuffNode(x, first);
		size += 1;
	}

	public LochNess getFirst() {
		return first.item;
	}

	/** Adds an item to the end of the list recursively */
/**	public void addLast(LochNess x) {
		if (first.next == null) {
			first.next = new StuffNode(x, null);
		} else {
			StuffNode p = first;
			first = first.next;
			addLast(x);
			first = p;
		}
	}
*/
	public void addLast(LochNess x) {
		size += 1;
		/** you don't need this special case if you use sentinel node */
		/** if (first == null) {
			first = new StuffNode(x, null);
			return;
		} */

		StuffNode p = first;
		while (p.next != null) {
			p = p.next;
		}
		p.next = new StuffNode(x, null);

	}

	/** get the size of SLList */
/**	public int size() {
		if (first.next == null) {
			return 1;
		} else {
			StuffNode p = first;
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

	private static int size(StuffNode p) {
		if (p.next == null) {
			return 1;
		}
		return 1 + size(p.next);
	}
*/

/** 	public int size() {
		StuffNode p = first;
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
		SLList<String> s1 = new SLList<String>("bone1");
		SLList<String> s2 = new SLList<>("bone2"); /* more industrial*/
		s1.addFirst("thugs1");
		s2.addFirst("thugs2");
		System.out.println(s1.first.item + " " + s1.first.next.item);
		System.out.println(s2.first.item + " " + s2.first.next.item);
	}
}
