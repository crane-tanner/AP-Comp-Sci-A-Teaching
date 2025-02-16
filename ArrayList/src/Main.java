import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(2);
        list.add(4);
        list.add(1);

        selectionSort(list);
        System.out.println(list);

    }


    public static void selectionSort(ArrayList<Integer> list) {
        for(int i = 0; i < list.size(); i++) {
            int min_idx = i;
            for(int j = i+1; j < list.size(); j++) {
                if(list.get(j) < list.get(min_idx) ) {
                    min_idx = j;
                }
            }
            if(min_idx != i) {
                int temp = list.get(i);
                list.set(i, list.get(min_idx));
                list.set(min_idx, temp);
            }

        }

    }
}