public class Main {
    public static void main(String[] args) {
        System.out.println("ArrayList examples");
        MyArrayList array = new MyArrayList<>();
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(5);
        array.add(6);
        array.removeLast();

        System.out.println(array.indexOf(2));
        System.out.println(array.exists(19));
        System.out.println(array.getFirst());
        System.out.println(array.size());
        System.out.println(array.get(4));

        array.addFirst(2421);
        array.addLast(352);
        System.out.println(array.getLast());
        array.remove(3);
        array.clear();

        System.out.println();
        System.out.println("LinkedList examples");

        MyLinkedList linkedList = new MyLinkedList<>();

        linkedList.add(5);
        linkedList.add(10);
        linkedList.add(15);
        linkedList.add(12.1);

        System.out.println(linkedList.size());
        System.out.println(linkedList.get(3));
        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());

        linkedList.set(2, "fs");
        System.out.println(linkedList.get(2));

        linkedList.addFirst(19);
        linkedList.addLast(134);

        System.out.println(linkedList.exists(10));

        linkedList.clear();
        System.out.println(linkedList.size());
    }
}
