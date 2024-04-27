public class MyQueue<T> {
    private MyLinkedList<T> list;

    public MyQueue(){
        list = new MyLinkedList<>();
    }

    public boolean empty(){
        return list.size() == 0;
    }

    public int size(){
        return list.size();
    }

    public T peek(){
        if (empty()){
            return null;
        }else{
            return list.getFirst();
        }
    }

    public T enqueue(T item){
        list.addLast(item);
        return item;
    }

    public T dequeue(){
        T removingItem = peek();
        list.removeFirst();
        return removingItem;
    }
}
