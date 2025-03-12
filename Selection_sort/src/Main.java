import java.util.Arrays;
public class Main {

    public static void selectionSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;

                }
            }

            int temp = arr[i];
            arr[i] = arr[min_idx];
            arr[min_idx] = temp;
        }
    }
    public static void main(String[] args) {
        int[] array = {6, 8, 7, 1, 5, 9, 20, 19, 2, 3, 4,13};

        System.out.println("Original array: " + Arrays.toString(array));

        selectionSort(array);

        System.out.println("\nSorted array: " + Arrays.toString(array));

    }
}