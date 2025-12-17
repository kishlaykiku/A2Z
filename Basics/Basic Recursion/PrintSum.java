/*
Problem Statement: Given a number 'N', find out the sum of the first N natural numbers.
*/

public class PrintSum {

    void solution(int n) {

        n = Math.abs(n);
        System.out.print(recursiveSumDisplay(n));
    }

    int recursiveSumDisplay(int n) {

        if(n == 0) return 0;
        return n + recursiveSumDisplay(n-1);
    }

    public static void main(String args[]) {

        PrintSum obj = new PrintSum();
        int n = 5;

        obj.solution(n);
    }
}