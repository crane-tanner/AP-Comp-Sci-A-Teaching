public class Main {
    public static void main(String[] args) {
        int[] myArray = {4,2,7,1,3};

        for(int i = 0; i < myArray.length-1; i++) {
            for(int j = 0; j < myArray.length - i - 1; j++){
                if(myArray[j] > myArray[j+1]) {
                    int temp = myArray[j];
                    myArray[j] = myArray[j+1];
                    myArray[j + 1] = temp;
                }
            }
        }

        for(int num : myArray) {
            System.out.print(num + " ");
        }

    }
}