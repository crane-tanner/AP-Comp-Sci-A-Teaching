import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(4);
        numbers.add(6);
        numbers.add(10);
        numbers.add(1);

        System.out.println(linear_search(numbers, 1));

    }

    public static int linear_search(ArrayList<Integer> nums, int key) {
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) == key) {
                System.out.println("The element " + nums.get(i) + " is at the index " + i + " in the ArrayList");
                return 0;
            }
        }
        return -1;
    }
}