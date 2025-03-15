public class Main {
    // A recursive method is a method that calls itself: It has a base case and a recursive case.
    // Example: program to find factorial of a number, recursively finding the sum
    // We can use recursion to make efficient searching & sorting algorithms
    // Examples: binarySearch, mergeSort
    public static void main(String[] args) {
        System.out.print(fibonacci(2));
    }

    public static int fibonacci(int n) {
       if(n == 0) {
           return 0;
       }
       else if (n == 1) {
           return 1;
       }
       else {
           return fibonacci(n-1) + fibonacci(n-2);
       }
    }
}

// Fibonacci sequence formula: Fn = Fn-1 + Fn-2 ...