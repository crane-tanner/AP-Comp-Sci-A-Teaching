public class Main { // insertion sort implementation
    public static void main(String[] args) {
        int[] arr = {9, 1, 3, 2, 5};

        for(int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i-1;
            while(j > -1 && temp < arr[j]) {
                arr[j+1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
