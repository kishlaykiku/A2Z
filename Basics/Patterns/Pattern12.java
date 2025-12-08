/*
1      1
12    21
123  321
12344321
[digits, space, digits]
*/

public class Pattern12 {

    void solution(int n) {

        for(int i = 0; i < n-1; i++) {

            // Digits
            for(int j = 0; j <= i; j++) System.out.print(j+1);

            // Space
            for(int k = 0; k < ((n-i)*2)-4; k++) System.out.print(" ");

            // Digits
            for(int l = i+1; l != 0; l--) System.out.print(l);

            System.out.println();
        }
    }

    public static void main(String args[]) {

        Pattern12 obj = new Pattern12();
        int n = 5;

        obj.solution(n);
    }
}