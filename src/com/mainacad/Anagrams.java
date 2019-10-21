package com.mainacad;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите числа через пробел: ");
        String  text = in.nextLine();
        String[] word = text.split(" ");

        for(int i = 0; i <= word.length - 1; i++) {
            for(int j = i + 1; j <= word.length - 1; j++)
                if(isRevers(word[i],word[j]) == true) {
                    System.out.println("Числа являются анаграммами: " + word[i] + "  " + word[j]);
                }
        }
    }



    private static boolean isRevers(String source, String revers) {
        char [] a = source.toCharArray();
        char [] b = revers.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);

        if (Arrays.equals(a, b)) {
            return true;
        }

        return false;
    }





//        static boolean isAnagram(String a, String b) {
//            a = a.toLowerCase();
//            b = b.toLowerCase();
//            if (a.length() != b.length()) {
//                return false;
//            }
//
//            char[] chars = a.toCharArray();
//            for (char c : chars) {
//                int index = b.indexOf(c);
//                if (index != -1) {
//                    b = b.substring(0, index) + b.substring(index + 1, b.length());
//                } else {
//                    return false;
//                }
//            }
//            return b.isEmpty();
//        }
//
//        public static void main(String[] args) {
//            Scanner scan = new Scanner(System.in);
//            System.out.println("Write down your 1st number:  ");
//            String a = scan.next();
//            System.out.println("Write down your 2nd number:  " );
//            String b = scan.next();
//
//            scan.close();
//            boolean ret = isAnagram(a, b);
//            System.out.println((ret) ? "Anagrams" : "Not Anagrams");
//
//        }
}
