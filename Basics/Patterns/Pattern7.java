/*
    *    
   ***   
  *****  
 ******* 
*********
[space, stars, space]
*/

public class Pattern7 {

    void solution(int n) {

        for(int i = 0; i < n; i++) {

            // Space
            for(int j = n-1; j > i; j--) System.out.print(" ");

            // Stars
            for(int k = 0; k < (i*(n-3))+1; k++) System.out.print("*");

            // Space
            for(int l = n-1; l > i; l--) System.out.print(" ");

            System.out.println();
        }
    }

    public static void main(String args[]) {

        Pattern7 obj = new Pattern7();
        int n = 5;

        obj.solution(n);
    }
}