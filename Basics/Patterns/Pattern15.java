/*
ABCDE
ABCD
ABC
AB
A
*/

public class Pattern15 {

    void solution(int n) {

        for(int i = 0; i < n; i++) {

            for(char alphaInc = 'A'; alphaInc < 'A'+(n-i); alphaInc++) System.out.print(alphaInc);

            System.out.println();
        }
    }

    public static void main(String args[]) {
        
        Pattern15 obj = new Pattern15();
        int n = 5;

        obj.solution(n);
    }
}