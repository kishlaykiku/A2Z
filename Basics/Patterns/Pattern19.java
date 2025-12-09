/*
**********
****  ****
***    ***
**      **
*        *
*        *
**      **
***    ***
****  ****
**********
[stars, space, stars] INVERT [stars, space, stars]
*/

public class Pattern19 {

    void solution(int n) {

        pt_up(n);
        pt_down(n);
    }

    void pt_up(int n) {

        for(int i = 0; i < n; i++) {

            // Stars
            for(int j = n; j > i; j--) System.out.print("*");

            // Space
            for(int k = 0; k < i*2; k++) System.out.print(" ");

            // Stars
            for(int l = n; l > i; l--) System.out.print("*");

            System.out.println();
        }
    }

    void pt_down(int n) {

        for(int i = 0; i < n; i++) {

            // Stars
            for(int j = 0; j <= i; j++) System.out.print("*");

            // Space
            for(int k = 0; k < (((n-i)*2)-2); k++) System.out.print(" ");

            // Stars
            for(int l = 0; l <= i; l++) System.out.print("*");

            System.out.println();
        }
    }

    public static void main(String args[]) {

        Pattern19 obj = new Pattern19();
        int n = 5;

        obj.solution(n);
    }
}