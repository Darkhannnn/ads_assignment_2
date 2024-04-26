public class MyLinkedList<T> implements MyList<T>{
    private class MyNode<E>{
        E element;
        MyNode<E> next;
        MyNode<E> prev;

        public MyNode(E element, MyNode<E> prev, MyNode<E> next){
            this.element = element;
            this.prev = prev;
            this.next = next;
        }
    }

    private MyNode<T> head;
    private MyNode<T> tail;
    private int size;

    public MyLinkedList(){
        head = null;
        tail = null;
        size = 0;
    }

    @Override
    public void add(T item) {
        MyNode<T> newNode = new MyNode<>(item, tail, null);
        if (head == null){
            head = newNode;
        } else{
            tail.next = newNode;
        }
        tail = newNode;
        size++;
    }

    @Override
    public void set(int index, T item) {
        checkMyIndex(index);
        MyNode<T> current = getNode(index);
        current.element = item;
    }

    @Override
    public void add(int index, T item) {
        if (index == size){
            add(item);
        }else if(index == 0){
            addFirst(item);
        }else {
            MyNode<T> prevNode = getNode(index - 1);
            MyNode<T> nextNode = prevNode.next;
            MyNode<T> newNode = new MyNode<>(item, prevNode, nextNode);
            prevNode.next = newNode;
            nextNode.prev = newNode;
            size++;
        }
    }

    @Override
    public void addFirst(T item) {
        MyNode<T> newNode = new MyNode<>(item, null, head);
        if (head == null){
            tail = newNode;
        } else{
            head.prev = newNode;
        }
        head = newNode;
        size++;
    }

    @Override
    public void addLast(T item) {
        add(item);
    }

    @Override
    public T get(int index) {
        checkMyIndex(index);
        MyNode current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return (T) current.element;
    }



    @Override
    public T getFirst() {
        return get(0);
    }

    @Override
    public T getLast() {
        return get(size - 1);
    }

    @Override
    public void remove(int index) {
        checkMyIndex(index);
        MyNode<T> nodeToRemove = getNode(index);
        MyNode<T> prevNode = nodeToRemove.prev;
        MyNode<T> nextNode = nodeToRemove.next;
        prevNode.next = nextNode;
        nextNode.prev = prevNode;
        size--;
    }

    @Override
    public void removeFirst() {
        head = head.next;
        head.prev = null;
        size--;
    }

    @Override
    public void removeLast() {
        tail = tail.prev;
        tail.next = null;
        size--;
    }

    @Override
    public void sort() {

    }

    @Override
    public int indexOf(Object object) {
        MyNode<T> current = head;
        int index = 0;
        while (current != null){
            if (current.element == object){
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object object) {
        MyNode<T> current = tail;
        int index = - 1;
        while (current != null){
            if (current.element == object){
                return index;
            }
            current = current.next;
            index--;
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
        head = tail = null;
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    private void checkMyIndex(int index) {
        if (index < 0 || index >= size){
            throw new IndexOutOfBoundsException("index is not correct");
        }
    }

    private MyNode<T> getNode(int index) {
        MyNode<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }
}
