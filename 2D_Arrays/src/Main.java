public class Main {
    public static void main(String[] args) {
        int[][] array = {{1,4,8},
                          {5,2,3}};

        mult2D(array);


    }


    public static void mult2D(int[][] arr) {
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                arr[i][j] *= 3;
            }
        }
    }
}