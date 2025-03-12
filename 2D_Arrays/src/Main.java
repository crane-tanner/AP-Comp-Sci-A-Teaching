public class Main {
    public static void main(String[] args) {
        int[][] array = {{1, 4, 8},
                         {5, 2, 3},
                         {20,21,30}
                        };

        mult2D(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println();
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
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