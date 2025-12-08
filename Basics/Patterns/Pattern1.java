/*
*****
*****
*****
*****
*****
*/

public class Pattern1 {

    void solution(int n) {

        for(int i = 0; i < n; i++) {

            for(int j = 0; j < n; j++) System.out.print("*");

            System.out.println();
        }
    }

    public static void main(String args[]) {

        Pattern1 obj = new Pattern1();
        int n = 5;

        obj.solution(n);
    }
}