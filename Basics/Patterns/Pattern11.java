/*
1
0 1
1 0 1
0 1 0 1
1 0 1 0 1
*/

public class Pattern11 {

    void solution(int n) {

        int bin = 0;
        for(int i = 0; i < n; i++) {

            if(i%2 == 0) bin = 1;

            for(int j = 0; j <= i; j++) {
                
                System.out.print(bin + " ");
                bin = 1 - bin;
            }

            System.out.println();
        }
    }

    public static void main(String args[]) {

        Pattern11 obj = new Pattern11();
        int n = 5;

        obj.solution(n);
    }
}