/*
*
**
***
****
*****
****
***
**
*
*/

public class Pattern10 {

    void solution(int n) {

        int stars = 0;
        for(int i = 0; i < (n*2)-1; i++) {

            if(i >= 5) stars--;
            else stars++;

            for(int j = 0; j < stars; j++) System.out.print("*");

            System.out.println();
        }
    }

    public static void main(String args[]) {

        Pattern10 obj = new Pattern10();
        int n = 5;

        obj.solution(n);
    }
}