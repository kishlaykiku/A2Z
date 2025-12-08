/*
1
22
333
4444
55555
*/

public class Pattern4 {

    void solution(int n) {

        for(int i = 0; i < n; i++) {

            for(int j = 0; j <= i; j++) System.out.print(i+1);

            System.out.println();
        }
    }

    public static void main(String args[]) {

        Pattern4 obj = new Pattern4();
        int n = 5;

        obj.solution(n);
    }
}