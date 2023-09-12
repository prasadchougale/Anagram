package com.randompractice.pgm;
import java.util.Arrays;
public class Anagram {
    public static void main(String[] args) {
        String str1 = "Race";
        String str2 = "Care";
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if (str1.length() == str2.length()) {
            char[] char1 = str1.toCharArray();
            char[] char2 = str2.toCharArray();

                Arrays.sort(char1);
            Arrays.sort(char2);

            if (Arrays.equals(char1, char2))
            {
                System.out.println(" String is anagram");
            } else {

                System.out.println("String is Not anagram");

            }
        }
    }

}
