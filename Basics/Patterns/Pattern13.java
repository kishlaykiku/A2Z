/*
1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15 
*/

public class Pattern13 {

    void solution(int n) {

        int numInc = 0;

        for(int i = 0; i < n; i++) {

            for(int j = 0; j < i+1; j++) {

                numInc++;
                System.out.print(numInc + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {

        Pattern13 obj = new Pattern13();
        int n = 5;

        obj.solution(n);
    }
}