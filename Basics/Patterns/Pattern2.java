/*
*
**
***
****
*****
*/

public class Pattern2 {

    void solution(int n) {

        for(int i = 0; i < n; i++) {

            for(int j = 0; j <= i; j++) System.out.print("*");

            System.out.println();
        }
    }

    public static void main(String args[]) {

        Pattern2 obj = new Pattern2();
        int n = 5;

        obj.solution(n);
    }
}