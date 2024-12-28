public class Unit6 {
    public static int[] divideEven(int[] arr) {
for(int i = 0; i < arr.length; i++) {
    if(arr[i] % 2 == 0) {
        arr[i] /= 2;
    }
}
        return arr;
    }
}
