/** Array based List.*/


//         0 1 2  3 4 5
// items: [6 9 -1 0 0 0 ...]
// size: 3

/* Invariants:
   addLast: The next itm we want to add, will go into position size
   getLast: The item we want to return is in position size - 1
   size: The number of items in the list should be size.

*/

public class AList<Item> {
	private Item[] items;
	private int size;

	/** Creates an empty list. */
	public AList() {
		items = (Item[]) new Object[100];
		size = 0;
	}

	public void resize(int capacity) {
		Item[] a = (Item[]) new Object[capacity];
		System.arraycopy(items, 0, a, 0, size);
		items = a;
	}

	/** Insets X into the back of the list. */
	public void addLast(Item x) {
		if (size == items.length) {
			resize(size * 2);
		}
		items[size] = x;
		size += 1;
	}

	/** Return item from the bakc of the list. */
	public Item getLast() {
		return items[size-1];
	}

	/** Gets the ith item in the List (0 is the front). */
	public Item get(int i) {
		return items[i];
	}

	/** Returns the number of items in the list. */
	public int size() {
		return size;
	}

	/** Deletes item from back of the List and 
	  * Returns deleted items. */
	public Item removeLast() {
		Item returnItem = items[size - 1];
		items[size - 1] = null;
		size = size - 1;
		return returnItem;
	} 

}