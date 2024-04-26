public class MyStack<T> {
    private MyLinkedList<T> list;

    public MyStack(){
        list = new MyLinkedList<>();
    }

    public boolean empty(){
        return list.size() == 0;
    }

    public int size(){
        return list.size();
    }

    public T peek(){
        return list.getLast();
    }

    public T push(T item){
        list.addLast(item);
        return item;
    }

    public T pop(){
        T removingItem = peek();
        list.removeLast();
        return removingItem;
    }
}
