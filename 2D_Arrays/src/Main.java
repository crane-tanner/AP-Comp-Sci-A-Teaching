public class Main { //2D arrays are simply arrays inside of arrays
                    // int[row_index][column_index]
                    // You can think of it as a matrix if you are more familiar with math terms
    public static void main(String[] args) {
        int[][] array = {{1, 4, 8},
                         {5, 2, 3},
                         {20,21,30}
                        };

        mult2D(array);
        for (int[] ints : array) {
            System.out.println();
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }

        }
    }

    // method to multiply every element in a 2D array by a specified value
    public static void mult2D(int[][] arr) {
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] % 2 != 0) {
                    arr[i][j] *= 3; // logic to multiply by 3 if odd number
                }
            }
        }
    }
}