
public class ArrayDeque<T> implements Deque<T>{
    private T[] items;
    private int size;
    private int RFACTOR = 2;

    public boolean isEmpty() {
        boolean t = true;
        for (T item : items) {
            if (item != null ) {
                t = false;
            }
        }
        return t;
    }

    public ArrayDeque() {
        this.items = (T []) new Object[8];
        this.size = 0;
    }

    public void printDeque() {
        for (int i = 0; i < size; i++) {
            System.out.print(items[i] + " ");
        }
        System.out.println();
    }

    public void resize(int capacity) {
        T[] a = (T []) new Object[capacity];
        System.arraycopy(items, 0, a, 0, size);
        items = a;
    }

    public void addFirst(T item) {
        T[] a = (T []) new Object[size + 1];
        System.arraycopy(items, 0, a, 1, size);
        a[0] = item;
        items = a;
        size += 1;
    }

    public void addLast(T item) {
        if (size == items.length) {
            resize(RFACTOR * size);
        }
        items[size] = item;
        size += 1;
    }

    public T removeFirst() {
        T removeItem = items[0];
        T[] a = (T []) new Object[size - 1];
        System.arraycopy(items, 1, a, 0, size-1);
        size -= 1;
        items = a;
        return removeItem;
    }

    public T removeLast() {
        T removeItem = items[size - 1];
        items[size-1] = null;
        size -= 1;
        if (size <= items.length/4) {
            resize(size);
        }
        return removeItem;
    }

    public int size() {
        return size;
    }

    public T get(int index) {
        if (index > size - 1 ) {
            return null;
        }
        return items[index];
    }



}
