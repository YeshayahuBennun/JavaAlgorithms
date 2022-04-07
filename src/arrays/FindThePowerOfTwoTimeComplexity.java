package arrays;

/*
 * What is the runtime of the below code?
 * */
public class FindThePowerOfTwoTimeComplexity {
    public static void main(String[] args) {
        int n = 50;
        powerOf2(n);
    }

    private static int powerOf2(int n) {
        if (n < 1) {               //-------------------> O(1)
            return 0;              //-------------------> O(1)
        } else if (n == 1) {       //-------------------> O(1)
            System.out.println(1); //-------------------> O(1)
            return 1;              //-------------------> O(1)
        } else {
            var prev = powerOf2(n / 2); //-------------------> O(logN) - Time Complexity
            var curr = prev * 2;   //-------------------> O(1)
            System.out.println(curr);//-------------------> O(1)
            return curr;             //-------------------> O(1)
        }

    }
}
