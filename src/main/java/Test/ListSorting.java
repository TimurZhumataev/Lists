package Test;

import java.util.ArrayList;
import java.util.Collections;

public class ListSorting {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("David");
        names.add("Ellie");
        names.add("Charlie");
        names.add("Aman");
        names.add("Bob");

        Collections.sort(names);
        System.out.println(names);

        Collections.sort(names, Collections.reverseOrder());
        System.out.println(names);

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(5);
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);

        Collections.sort(nums);
        System.out.println(nums);

        Collections.sort(nums, Collections.reverseOrder());
        System.out.println(nums);
    }
}