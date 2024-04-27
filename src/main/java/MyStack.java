public class MyStack<T> {
    //    declaring needed variables
    private MyLinkedList<T> list;

    public MyStack(){
        list = new MyLinkedList<>();
    }

//    returns whether the stack is empty
    public boolean empty(){
        return list.size() == 0;
    }

//    returns the size of the stack
    public int size(){
        return list.size();
    }

//    returns a reference to the topmost element of the stack
    public T peek(){
        return list.getLast();
    }

//    adds the element at the top of the stack
    public T push(T item){
        list.addLast(item);
        return item;
    }

//    retrieves and deletes the topmost element of the stack
    public T pop(){
        T removingItem = peek();
        list.removeLast();
        return removingItem;
    }
}
