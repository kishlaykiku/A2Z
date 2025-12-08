/*
    A    
   ABA   
  ABCBA  
 ABCDCBA 
ABCDEDCBA
[space, aphahabets, space]
*/

public class Pattern17 {

    void solution(int n) {

        for(int i = 0; i < n; i++) {

            char alphaInc = 'A';

            // Space
            for(int j = 0; j < n-i-1; j++) System.out.print(" ");

            // Alphabets
            for(int k = 0; k < (i*2)+1; k++) {

                System.out.print(alphaInc);
                if(k >= i)
                    alphaInc--;
                else
                    alphaInc++;
            }

            // Space
            for(int j = 0; j < n-i-1; j++) System.out.print(" ");

            System.out.println();
        }
    }

    public static void main(String args[]) {

        Pattern17 obj = new Pattern17();
        int n = 15;

        obj.solution(n);
    }
}