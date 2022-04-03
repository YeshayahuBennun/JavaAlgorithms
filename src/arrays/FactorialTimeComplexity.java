package arrays;

/*
 * What is the runtime of below code.
 * */
public class FactorialTimeComplexity {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(factorial(n));
    }

    private static int factorial(int n) {
        if (n < 0) {
            return -1;
        } else if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    /*
    * n!=1*2*3...n*
    * 3!=1*2*3 = 6
    *
    * M(n) = O(1)+M(n-1)         ----------------------------> M(n)=1+M(n-1)
    *                                                          =1+(1+M((n-1)-1)
    *                                                          =2+M(n-2)
    *                                                          =2+1+M((n-2)-1)   ---------> Time Complexity O(N)
    *                                                          =3+M(n-3)
    *
    *                                                          =a+M(n-a)
    *                                                          =n+M(n-n)
    *                                                          = n+1
    *                                                          =n
    * M(1) = O(1)
    * M(n-1)=O(1)+M((n-1)-1)
    * M(n-1)=O(1)+M((n-2)-1)
    *
    * */

}
