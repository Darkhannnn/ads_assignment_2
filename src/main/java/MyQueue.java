public class MyQueue<T> {
    //    declaring needed variables
    private MyLinkedList<T> list;

    public MyQueue(){
        list = new MyLinkedList<>();
    }

//    returns whether the queue is empty
    public boolean empty(){
        return list.size() == 0;
    }

//    returns the size of the queue
    public int size(){
        return list.size();
    }

//    returns a reference to the front element of the queue
    public T peek(){
        if (empty()){
            return null;
        }else{
            return list.getFirst();
        }
    }

//    adds the element at the end of the queue
    public T enqueue(T item){
        list.addLast(item);
        return item;
    }

//    retrieves and deletes the front element of the queue
    public T dequeue(){
        T removingItem = peek();
        list.removeFirst();
        return removingItem;
    }
}
