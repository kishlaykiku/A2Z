/*
Problem Statement: Given a number 'N',  print its factorial.
To obtain the factorial of a number, it has to be multiplied by all the whole numbers preceding it.
More precisely N! = N*(N-1)*(N-2) … 1.

Note: N is always a positive number.

Example 1 =>
    Input: N = 5
    Output: 120
    Explanation: 5! = 5*4*3*2*1
*/

public class PrintFactorial {

    void solution(int n) {

        n = Math.abs(n);
        System.out.print(recursiveFactDisplay(n));
    }

    int recursiveFactDisplay(int n) {

        if(n == 0) return 1;
        return n * recursiveFactDisplay(n-1);
    }

    public static void main(String args[]) {

        PrintFactorial obj = new PrintFactorial();
        int n = 1;

        obj.solution(n);
    }
}