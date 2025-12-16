/*
Problem Statement: Given an integer N, write a program to print your name N times.
Example =>
    Input: N = 3
    Output: Kishlay Kishlay Kishlay
    Explanation: Name is printed 3 times.
*/

public class PrintName {

    void solution(int n, String name) {

        int count = 0;
        recursiveNameDisplay(count, n, name);
    }

    void recursiveNameDisplay(int count, int n, String name) {

        if(count == n) return;
        System.out.print(name + " ");
        recursiveNameDisplay(count+1, n, name);
    }

    public static void main(String args[]) {

        PrintName obj = new PrintName();
        int n = 5;
        String name = "Kishlay";

        obj.solution(n, name);
    }
}