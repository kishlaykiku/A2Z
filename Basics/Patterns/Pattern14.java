/*
A
AB
ABC
ABCD
ABCDE
*/

public class Pattern14 {

    void solution(int n) {

        for(int i = 0; i < n; i++) {

            for(char alphaInc = 'A'; alphaInc <= 'A'+ i; alphaInc++) System.out.print(alphaInc);

            System.out.println();
        }
    }

    public static void main(String args[]) {

        Pattern14 obj = new Pattern14();
        int n = 5;

        obj.solution(n);
    }
}