package Test;


public class TreeSet {
    public static void main(String[] args) {
        java.util.TreeSet<Integer> treeSet = new java.util.TreeSet<>();
        treeSet.add(1);
        treeSet.add(2);
        treeSet.add(3);
        treeSet.add(4);
        treeSet.add(5);

        System.out.println(treeSet);

        java.util.TreeSet<String> words = new java.util.TreeSet<>();
        words.add("e");
        words.add("c");
        words.add("a");
        words.add("b");
        words.add("d");

        System.out.println(words);
    }
}
