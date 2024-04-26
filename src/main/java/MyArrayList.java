public class MyArrayList<T> implements MyList<T>{
    private T[] arr;
    private int size;

    public MyArrayList(){
        arr = (T[]) new Object[5];
        size = 0;
    }
    @Override
    public void add(T item) {
        if (size >= arr.length){
            increaseBuffer();
        }
        arr[size++] = item;
    }

    private void increaseBuffer() {
        T[] newArr = (T[]) new Object[arr.length * 2];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        arr = newArr;
    }

    @Override
    public void set(int index, T item) {
        checkMyIndex(index);
        arr[index] = item;
    }

    @Override
    public void add(int index, T item) {
        checkMyIndex(index);
        if (size >= arr.length){
            increaseBuffer();
        }
        arr[index] = item;
    }

    private void checkMyIndex(int index) {
        if (index < 0 || index >= size){
            throw new IndexOutOfBoundsException("index is not correct");
        }
    }

    @Override
    public void addFirst(T item) {
        add(0, item);
    }

    @Override
    public void addLast(T item) {
        add(item);
    }

    @Override
    public T get(int index) {
        checkMyIndex(index);
        return arr[index];
    }

    @Override
    public T getFirst() {
        return arr[0];
    }

    @Override
    public T getLast() {
        return arr[size-1];
    }

    @Override
    public void remove(int index) {
        checkMyIndex(index);
        for (int i = index + 1; i < size; i++) {
            arr[i-1] = arr[i];
        }
        size--;
    }

    @Override
    public void removeFirst() {
        remove(0);
    }

    @Override
    public void removeLast() {
        remove(size - 1);
    }

    @Override
    public void sort() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - 1 - i; j++) {
                if (((Comparable<T>)arr[j]).compareTo(arr[j + 1]) > 0){
                    T temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    @Override
    public int indexOf(Object object) {
        for (int i = 0; i < size; i++) {
            if (object.equals(arr[i])){
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object object) {
        for (int i = size-1; i >= 0; i++) {
            if (object.equals(arr[i])){
                return i;
            }
        }
        return -1;
    }

    @Override
    public boolean exists(Object object) {
        return indexOf(object) != -1;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public void clear() {
        arr = (T[]) new Object[5];
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }
}
