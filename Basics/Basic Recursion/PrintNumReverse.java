/*
Problem Statement: Given an integer 'N', write a program to print numbers from N to 1.
*/

public class PrintNumReverse {

    void solution(int n) {

        n = Math.abs(n);
        int count = n;
        recursiveNumDisplay(count, n);
    }

    void recursiveNumDisplay(int count, int n) {

        if(count < 1) return;
        System.out.print(count + " ");
        recursiveNumDisplay(count-1, n);
    }

    public static void main(String args[]) {

        PrintNumReverse obj = new PrintNumReverse();
        int n = 5;

        obj.solution(n);
    }
}