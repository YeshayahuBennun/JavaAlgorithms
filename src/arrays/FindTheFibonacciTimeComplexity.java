package arrays;

/*
 * What's the runtime of the below code?
 * * */
public class FindTheFibonacciTimeComplexity {

    public static void main(String[] args) {
        int n = 5;
        allFib(n);
    }

    private static void allFib(int n) {
        for (int i = 0; i < n; i++) {
            fib(i);
        }
    }

    private static int fib(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {  //-----------------------------> O(2^n)
            return 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }
}
