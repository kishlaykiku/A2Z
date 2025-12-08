/*
    *    
   ***   
  *****  
 ******* 
*********
*********
 ******* 
  *****  
   ***   
    *   
[space, stars, space] INVERT [space, stars, space]
*/

public class Pattern9 {

    void solution(int n) {

        pt_up(n);
        pt_down(n);
    }

    void pt_up(int n) {

        for(int i = 0; i < n; i++) {

            // Space
            for(int j = n-1; j > i; j--) System.out.print(" ");

            // Stars
            for(int k = 0; k < (i*2)+1; k++) System.out.print("*");

            // Space
            for(int l = n-1; l > i; l--) System.out.print(" ");

            System.out.println();
        }
    }

    void pt_down(int n) {

        for(int i = 0; i < n; i++) {

            // Space
            for(int j = 0; j < i; j++) System.out.print(" ");

            // Stars
            for(int k = 0; k < ((n-(i+1))*2)+1; k++) System.out.print("*");

            // Space
            for(int l = 0; l < i; l++) System.out.print(" ");

            System.out.println();
        }
    }

    public static void main(String args[]) {

        Pattern9 obj = new Pattern9();
        int n = 9;

        obj.solution(n);
    }
}