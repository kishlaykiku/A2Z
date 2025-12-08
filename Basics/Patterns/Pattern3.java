/*
1
12
123
1234
12345
*/

public class Pattern3 {

    void solution(int n) {

        for(int i = 0; i < n; i++) {

            for(int j = 0; j <= i; j++) System.out.print(j+1);

            System.out.println();
        }
    }

    public static void main(String args[]) {

        Pattern3 obj = new Pattern3();
        int n = 5;

        obj.solution(n);
    }
}