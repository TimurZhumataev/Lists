package Test;

public class LinkedList {
    public static void main(String[] args) {

        // крч основное различие между LinkedList и ArrayList только в том, что в LinkedLIst вроще добавлять удалять новые элементы если в листе уже хранятся тысячи значений, если сделать тоже самое с ArrayList, то все элементы будут перемещены влево или вправо, что не эффективно, крч в целом просто и понятно

        java.util.LinkedList<String> names = new java.util.LinkedList<>();

        names.add("John");
        names.addFirst("Jane");
        names.addLast("Doe");

        System.out.println(names);

        names.removeFirst();
        System.out.println(names.getFirst());
        System.out.println(names);
    }
}