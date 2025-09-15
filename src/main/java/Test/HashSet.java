package Test;

public class HashSet {
    public static void main(String[] args) {
        java.util.HashSet<String> cars = new java.util.HashSet<String>();

        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mersedes");
        cars.add("Ferrari");

        System.out.println(cars);
        System.out.println(cars.contains("BMW"));
        cars.remove("BMW");
        System.out.println(cars.contains("BMW"));
        cars.clear();

        java.util.HashSet<Integer> nums = new java.util.HashSet<Integer>();

        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);

        System.out.println(nums);
        System.out.println(nums.contains(1));

        for(int i = 0; i < nums.size(); i++){
            if(nums.contains(i)){
                System.out.println(i + " exist in set");
            }else{
                System.out.println(i + " does not exist in set");
            }
        }
    }
}
