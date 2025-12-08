/*
*********
 ******* 
  *****  
   ***   
    *    
[space, stars, space]
*/

public class Pattern8 {

    void solution(int n) {

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

        Pattern8 obj = new Pattern8();
        int n = 5;

        obj.solution(n);
    }
}