public class Main { // insertion sort implementation
    public static void main(String[] args) {

        int[] numArr = {42, 7, 4, 8}; // array of numbers

        for (int i = 1; i < numArr.length; i++) {
            int temp = numArr[i];
            int j = i - 1;
            while (j > -1 && temp < numArr[j]) {
                numArr[j+1] = numArr[j];
                numArr[j] = temp;
                j--;
            }
        }
        for (int num : numArr) {
            System.out.print(num + " ");
        }
    }
}

