/*
E
D E
C D E
B C D E
A B C D E
*/

public class Pattern18 {

    void solution(int n) {

        for(int i = 0; i < n; i++) {

            for(int alphaInc = ('A'+n-1)-i; alphaInc <= ('A'+n-1); alphaInc++) System.out.print((char)alphaInc + " ");

            System.out.println();
        }
    }

    public static void main(String args[]) {

        Pattern18 obj = new Pattern18();
        int n = 5;

        obj.solution(n);
    }
}