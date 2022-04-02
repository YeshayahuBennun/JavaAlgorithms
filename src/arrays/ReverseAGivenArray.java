package arrays;
/*
 * Create a method which takes an array as a parameter and reverse it.
 * Find the runtime of created method.
 * */

import java.util.Arrays;

public class ReverseAGivenArray {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5};

        reverseArray(arr);

    }

    private static void reverseArray(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {// ----------->O(n/2) Time complexity ------>O(n)
            int other = arr.length - i - 1;       // ----------->O(1)
            int temp = arr[i];                    // ----------->O(1)
            arr[i] = arr[other];                  // ----------->O(1)
            arr[other] = temp;                    // ----------->O(1)
        }

        System.out.println(Arrays.toString(arr));// ----------->O(1)
    }

}
