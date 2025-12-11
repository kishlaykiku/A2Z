/*
****
*  *
*  *
****
Print `*` for first and last row or first and last column ---|
[Boundary Cases: {i = 1}, {i = n-1}, {j = 1}, {j = n-1}] <---|
*/

public class Pattern21 {

    void solution(int n) {

        for(int i = 0; i < n-1; i++) {

            for(int j = 0; j < n-1; j++) {
                
                if(i == 0 || j == 0 || i == n-2 || j == n-2) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {

        Pattern21 obj = new Pattern21();
        int n = 5;

        obj.solution(n);
    }
}