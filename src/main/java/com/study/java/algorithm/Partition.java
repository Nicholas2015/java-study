package com.study.java.algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * 给你一个字符串 s，请你将 s 分割成一些子串，使每个子串都是 回文串 。返回 s 所有可能的分割方案。
 * <p>
 * 回文串 是正着读和反着读都一样的字符串。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：s = "aab"
 * 输出：[["a","a","b"],["aa","b"]]
 * 示例 2：
 * <p>
 * 输入：s = "a"
 * 输出：[["a"]]
 *  
 * <p>
 * 提示：
 * <p>
 * 1 <= s.length <= 16
 * s 仅由小写英文字母组成
 */
public class Partition {

    public static boolean isPalindrome(char[] chars, int left, int right) {
        while (left < right) {
            if (chars[left] != chars[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();

        if (null == s || s.length() < 1 || s.length() > 16) {
            return res;
        }
        char[] chars = s.toCharArray();
        List<String> list = new ArrayList<>();
        trans(chars, 0, s.length(), list, res);

        return res;
    }

    private static void trans(char[] chars, int index, int length, List<String> list, List<List<String>> res) {
        if (index == (length)) {
            res.add(new ArrayList<>(list));
            return;
        }

        for (int i = index; i < length; i++) {
            // 因为截取字符串是消耗性能的，因此，采用传子串下标的方式判断一个子串是否是回文子串
            if (!isPalindrome(chars,index,i)) {
                continue;
            }
            list.add(new String(chars, index, i + 1 - index));
            trans(chars, i + 1, length, list, res);
            list.remove(list.size() - 1);
        }
    }

    public static void main(String[] args) {
        String s = "aabsfafa";
//        System.out.println(new String(s.toCharArray(), 0, 0));
        System.out.println(partition(s));


        s = "b";
        System.out.println(partition(s));

    }
}
