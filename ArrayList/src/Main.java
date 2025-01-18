import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(9);
        list.add(1);
        list.add(10);
        list.add(0);

        list.sort(Collections.reverseOrder());
        System.out.println(list);

    }
}