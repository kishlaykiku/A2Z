/*
*****
****
***
**
*
*/

public class Pattern5 {

    void solution(int n) {

        for(int i = 0; i < n; i++) {

            for(int j = 0; j < n-i; j++) System.out.print("*");

            System.out.println();
        }
    }

    public static void main(String args[]) {

        Pattern5 obj = new Pattern5();
        int n = 5;

        obj.solution(n);
    }
}