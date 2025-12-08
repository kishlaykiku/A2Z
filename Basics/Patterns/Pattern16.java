/*
A
BB
CCC
DDDD
EEEEE
*/

public class Pattern16 {

    void solution(int n) {

        char alphaInc = 'A';
        for(int i = 0; i < n; i++) {

            for(int j = 0; j <= i; j++) System.out.print(alphaInc);
            alphaInc++;

            System.out.println();
        }
    }

    public static void main(String args[]) {

        Pattern16 obj = new Pattern16();
        int n = 5;

        obj.solution(n);
    }
}