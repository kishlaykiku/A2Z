/*
Problem Statement: Count the frequency of characters

Example =>
    Input: str = "abcdabefc" || inpSize = 4 || charCheck = a, c, f, z
    Output: 2 2 1 0
    Explanation: The frequency of a, c, f, z in arr is 2, 2, 1, 0.
*/

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class CharMapModern {

    private static Scanner sc = new Scanner(System.in);

    Map<Character, Integer> preCompute(String str) {

        Map<Character, Integer> freq = new HashMap<>();

        for(int i = 0; i < str.length(); i++) {
            freq.put(str.charAt(i), freq.getOrDefault(str.charAt(i), 0)+1);
        }

        return freq;
    }

    public static void main(String args[]) {

        CharMapModern obj = new CharMapModern();
        String str = sc.nextLine();
        int inpSize = sc.nextInt();

        Map<Character, Integer> result = obj.preCompute(str);

        for(int i = 0; i < inpSize; i++) {
            char cFreq = sc.next().charAt(0);
            System.out.print(result.getOrDefault(cFreq, 0));
            if(i < inpSize-1)
                System.out.print(" ");
        }
    }
}