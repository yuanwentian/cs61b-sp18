import java.util.LinkedList;

public class LinkedListDeque<T> implements Deque<T>{
    public class Node<T>{
        private T item;
        private Node next;
        private Node prev;

        private Node(T x) {
            this.item = x;
            this.prev = null;
            this.next = null;
        }
    }

    private Node sentinel;
    private int size;


    /** Create an empty LinkedListDeque   */
    public LinkedListDeque(){
        sentinel = new Node<>(63);
        size = 0;
    }

    public void addFirst(T item) {
        // sentinel -> 2 -> 3  1
        // sentinel -> 1 -> 2 -> 3

        Node x = new Node(item);
        size += 1;
        if (sentinel.next == null) {
            x.next = x;
            x.prev = x;
            sentinel.next = x;
        } else {
            x.next = sentinel.next;
            x.prev = sentinel.next.prev;
            sentinel.next = x;
        }
    }

    public void addLast(T item) {
        // sentinel ->
        // sentinel -> 1
        // sentinel -> 1 -> 2 -> 3

        // sentinel -> 1 -> 2 -> 3 -> 4
        Node x = new Node(item);
        size += 1;
        if (sentinel.next == null) {
            x.prev = x;
            x.next = x;
            sentinel.next = x;
        } else {
            sentinel.next.prev.next = x;
            x.next = sentinel.next;
            x.prev = sentinel.next.prev;
            sentinel.next.prev = x;
        }
    }

    public boolean isEmpty() {
        if (sentinel.prev == null && sentinel.next == null) {
            return true;
        } else {
            return false;
        }
    }

    public int size() {
        return size;
    }

    public void printDeque() {
        Node p = sentinel.next;
        for (int i = 0; i < size; i++) {
            System.out.print(p.item + " ");
            p = p.next;
        }
        System.out.println();
    }

    public T removeFirst() {
        // sentinel -> 1 -> 2 -> 3 -> 4
        // sentinel -> 2 -> 3 -> 4 1->2
        T removeItem = (T) sentinel.next.item;
        if (size == 1) {
            sentinel.next.item = null;
            sentinel.next = null;
        } else {
            sentinel.next.next.prev = sentinel.next.prev; // 2.prev->4
            sentinel.next = sentinel.next.next; // sentinel -> 2
            sentinel.next.prev.next.item = null; // 1 -> null
            sentinel.next.prev.next = sentinel.next; // 4.next -> 2
        }
        size -= 1;
        return removeItem;
    }

    public T removeLast() {
        // sentinel -> 1 -> 2 -> 3 -> 4
        // sentinel -> 1 -> 2 -> 3
        T removeItem = (T) sentinel.next.prev.item;
        if (size == 1) {
            sentinel.next.item = null;
            sentinel.next = null;
        } else {
            sentinel.next.prev = sentinel.next.prev.prev; // 1.prev -> 3
            sentinel.next.prev.next.item = null; // 4 -> null
            sentinel.next.prev.next = sentinel.next; // 4.next -> 2
        }
        size -= 1;
        return removeItem;
    }

    /** iteratively get */
    public T get(int index) {
        Node ptr = sentinel;
        if (index > size - 1) {
            return null;
        }
        for (int i = 0; i <= index; i++) {
            ptr = ptr.next;
        }
        return (T) ptr.item;
    }

    /** recursively get */
    public T getRecursive(int index) {
        return (T) getRecursiveHelper(sentinel.next, index);
    }

    private T getRecursiveHelper(Node start, int index) {
        if (index == 0) {
            return (T) start.item;
        }
        else {
            return (T) getRecursiveHelper(start.next, index-1);
        }
    }
}
