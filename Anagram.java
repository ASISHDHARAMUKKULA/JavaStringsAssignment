package StringsAssignment;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {
        String s1 = "abcd";
        char str1[] = s1.toCharArray();
        String s2 = "dabc";
        char str2[] = s2.toCharArray();
        boolean b = checkAnagram(str1, str2);
        if (b) {
            System.out.println("Both Strings are Anagram");
        } else {
            System.out.println("Both Strings are not anagram");
        }
    }

    public static boolean checkAnagram(char str1[], char str2[]) {
        boolean b = true;
        int len1 = str1.length;
        int len2 = str2.length;
        if (len1 == len2) {
            Arrays.sort(str1);
            System.out.println(str1);
            Arrays.sort(str2);
            System.out.println(str2);
            for (int k = 0; k < len1; k++) {
                if (str1[k] != str2[k])
                    b = false;
            }
        }
        return b;
    }
}

