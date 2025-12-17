/*
Problem Statement: Given an integer 'N', write a program to print numbers from 1 to N.
*/

public class PrintNumForward {

    void solution(int n) {

        n = Math.abs(n);
        int count = 1;
        recursiveNumDisplay(count, n);
    }

    void recursiveNumDisplay(int count, int n) {

        if(count > n) return;
        System.out.print(count + " ");
        recursiveNumDisplay(count+1, n);
    }

    public static void main(String args[]) {

        PrintNumForward obj = new PrintNumForward();
        int n = 5;

        obj.solution(n);
    }
}