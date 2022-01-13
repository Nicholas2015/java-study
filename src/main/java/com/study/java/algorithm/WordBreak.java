package com.study.java.algorithm;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 单词拆分
 * 给你一个字符串 s 和一个字符串列表 wordDict 作为字典。请你判断是否可以利用字典中出现的单词拼接出 s 。
 * <p>
 * 注意：不要求字典中出现的单词全部都使用，并且字典中的单词可以重复使用。
 * <p>
 * <p>
 * 示例 1：
 * 输入: s = "leetcode", wordDict = ["leet", "code"]
 * 输出: true
 * 解释: 返回 true 因为 "leetcode" 可以由 "leet" 和 "code" 拼接成。
 * <p>
 * 示例 2：
 * 输入: s = "applepenapple", wordDict = ["apple", "pen"]
 * 输出: true
 * 解释: 返回 true 因为 "applepenapple" 可以由 "apple" "pen" "apple" 拼接成。
 * 注意，你可以重复使用字典中的单词。
 * <p>
 * 示例 3：
 * 输入: s = "catsandog", wordDict = ["cats", "dog", "sand", "and", "cat"]
 * 输出: false
 * <p>
 * 提示：
 * <p>
 * 1 <= s.length <= 300
 * 1 <= wordDict.length <= 1000
 * 1 <= wordDict[i].length <= 20
 * s 和 wordDict[i] 仅有小写英文字母组成
 * wordDict 中的所有字符串 互不相同
 *
 * @author Administrator
 */
public class WordBreak {

    public static boolean wordBreak(String s, List<String> wordDict) {
        Set<String> set = new HashSet<>(wordDict);
        int length = s.length();
        boolean flag[] = new boolean[length + 1];
        flag[0] = true;
        for (int i = 1; i <= length; i++) {
            for (int j = 0; j < i; j++) {
                if (flag[j] && set.contains(s.substring(j,i))){
                    flag[i] = true;
                    break;
                }
            }
        }
        return flag[length];
    }

    public static void main(String[] args) {
        List<String> wordDict = Arrays.asList("cats", "dog", "sand", "and", "cat");
        String s = "catsandog";
        System.out.println(wordBreak(s, wordDict));

        wordDict = Arrays.asList("apple", "pen");
        s = "applepenapple";
        System.out.println(wordBreak(s, wordDict));

        wordDict = Arrays.asList("leet", "code");
        s = "leetcode";
        System.out.println(wordBreak(s, wordDict));
    }
}
