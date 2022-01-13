package com.study.java.algorithm;

import java.util.*;

/**
 * 给定一个非空字符串 s 和一个包含非空单词列表的字典 wordDict，在字符串中增加空格来构建一个句子，使得句子中所有的单词都在词典中。返回所有这些可能的句子。
 * <p>
 * 说明：
 * <p>
 * 分隔时可以重复使用字典中的单词。
 * 你可以假设字典中没有重复的单词。
 * 示例 1：
 * <p>
 * 输入:
 * s = "catsanddog"
 * wordDict = ["cat", "cats", "and", "sand", "dog"]
 * 输出:
 * [
 *   "cats and dog",
 *   "cat sand dog"
 * ]
 * 示例 2：
 * <p>
 * 输入:
 * s = "pineapplepenapple"
 * wordDict = ["apple", "pen", "applepen", "pine", "pineapple"]
 * 输出:
 * [
 * "pine apple pen apple",
 * "pineapple pen apple",
 * "pine applepen apple"
 * ]
 * 解释: 注意你可以重复使用字典中的单词。
 * <p>
 * 示例3：
 * 输入:
 * s = "catsandog"
 * wordDict = ["cats", "dog", "sand", "and", "cat"]
 * 输出:
 * []
 */
public class WordBreakAdvanced {

    public static List<String> wordBreak(String s, List<String> wordDict) {
        Set<String> set = new HashSet<>(wordDict);
        List<String> result = new ArrayList<>();
        split(s, result, 0, new ArrayList<String>(), set);
        return result;
    }

    public static void split(String s, List<String> result, int index, ArrayList<String> strings, Set<String> set) {
        int length = s.length();
        if (index == length) {
            result.add(String.join(" ", strings));
            return;
        }

        for (int i = index; i < length; i++) {
            String str = s.substring(index, i + 1);
            if (set.contains(str)) {
                strings.add(str);
                split(s, result, i + 1, strings, set);
                strings.remove(strings.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        List<String> wordDict = Arrays.asList("cats", "dog", "sand", "and", "cat");
        String s = "catsandog";
        System.out.println(wordBreak(s, wordDict));

        wordDict = Arrays.asList("apple", "pen", "applepen", "pine", "pineapple");
        s = "pineapplepenapple";
        System.out.println(wordBreak(s, wordDict));

        wordDict = Arrays.asList("cats", "dog", "sand", "and", "cat");
        s = "catsanddog";
        System.out.println(wordBreak(s, wordDict));
    }
}
