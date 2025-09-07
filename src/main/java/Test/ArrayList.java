package Test;

import java.util.Collections;

public class ArrayList {
    public static void main(String[] args) {
        java.util.ArrayList<String> characters = new java.util.ArrayList<>();
        characters.add("Luffy");
        characters.add("Zoro");
        characters.add("Sanji");

        characters.add(0, "Teach");

        characters.set(0, "Shanks");

        characters.get(0);

        characters.remove(2);

        Collections.sort(characters);

        System.out.println(characters.size());

        System.out.println(characters);

        for(int i = 0; i < characters.size(); i++){
            System.out.println(characters.get(i));
        }

        characters.clear();

        System.out.println(characters.size());

        System.out.println(characters);

        java.util.ArrayList<Integer> nums = new java.util.ArrayList<>();

        nums.add(3);
        nums.add(4);
        nums.add(5);
        nums.add(1);
        nums.add(2);

        Collections.sort(nums);

        System.out.println(nums);

        var cars = new java.util.ArrayList<String>();

        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mercedes");

        System.out.println(cars);
    }
}