public class Main {
    public static void main(String[] args) {
        MyArrayList array = new MyArrayList<>();
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(5);
        array.add(6);
        array.removeLast();
        array.add(6, 23);

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

    }
}
