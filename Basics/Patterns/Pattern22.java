/*
4 4 4 4 4 4 4        0 0 0 0 0 0 0
4 3 3 3 3 3 4        0 1 1 1 1 1 0
4 3 2 2 2 3 4        0 1 2 2 2 1 0
4 3 2 1 2 3 4  --->  0 1 2 3 2 1 0 
4 3 2 2 2 3 4        0 1 2 2 2 1 0
4 3 3 3 3 3 4        0 1 1 1 1 1 0
4 4 4 4 4 4 4        0 0 0 0 0 0 0

The idea here is that, we take the minimum distance of an element from all four sides and subtract that number from `n` (here 4)
https://youtu.be/tNm_NNSB3_w?si=8_otZqU2cidSzIsW&t=4540
*/

public class Pattern22 {

    void solution(int n) {

        for(int i = 0; i < (n*2)-1; i++) {

            for(int j = 0; j < (n*2)-1; j++) {

                int top = i;
                int bottom = ((n*2)-2)-i;
                int left = j;
                int right = ((n*2)-2)-j;

                System.out.print(n-Math.min(Math.min(top, bottom), Math.min(left, right)) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {

        Pattern22 obj = new Pattern22();
        int n = 5;

        obj.solution(n);
    }
}