import java.util.LinkedList;

public class LinkedListDeque<T> {
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
        // sentinel -> 2 -> 3 -> 4
        Node x = new Node(item);
        size += 1;
        x.next = sentinel.next;
        sentinel.next = x;
        if (x.next != null) {
            x.next.prev = x;
        }
        x.prev = sentinel;
    }

    public void addLast(T item) {
        size += 1;
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

    }

    public T removeFirst() {
        size -= 1;
        return null;
    }

    public T removeLast() {
        size -= 1;
        return null;
    }

    /** iteratively get */
    public T get(int index) {
        return null;
    }

    /** recursively get */
    public T getRecursive(int index) {
        return null;
    }
}
