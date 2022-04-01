package arrays;

/*
 * Create a function which prints to the console the pairs from given array.
 * Find the time complexity for created method.
 * */

public class FindPairsInAnArray {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5};
        printPairs(arr);
    }

    private static void printPairs(int[] arr) {
        for (int i = 0; i < arr.length; i++) {                 //O(n)
            for (int j = 0; j < arr.length; j++) {             //O(n)
                System.out.println(arr[i] + "," + arr[j]);     //O(1)
            }                                                  //Time complexity ----------> n*n = n^2 - O(n^2)
        }
    }
}
