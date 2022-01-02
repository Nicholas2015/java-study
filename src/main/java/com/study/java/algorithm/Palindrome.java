package com.study.java.algorithm;

import java.util.Objects;

/**
 * 回文字符串
 *
 * @author Administrator
 */
public class Palindrome {

    private static boolean isAlphanumeric(char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9');
    }

    private static boolean ignoreCase(char a, char b) {
        if (a >= 'A' && a <= 'Z') {
            a += 32;
        }
        if (b >= 'A' && b <= 'Z') {
            b += 32;
        }
        System.out.println(a == b);
        return a == b;
    }

    public static boolean isPalindrome(String str) {
        if (null == str || str.length() == 0) {
            return true;
        }
        for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
            while (i < j && !isAlphanumeric(str.charAt(i))) {
                i++;
            }
            while (i < j && !isAlphanumeric(str.charAt(j))) {
                j--;
            }
            System.out.println(i + "===" + j);
            if (i < j && !ignoreCase(str.charAt(i), str.charAt(j))) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        boolean palindrome = isPalindrome("race a e-Car");
        System.out.println(palindrome);
    }
}
