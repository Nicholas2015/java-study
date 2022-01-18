package com.study.java.algorithm.easy;

import java.util.*;
import java.util.stream.Collectors;

/**
 * 存在重复元素
 * 给你一个整数数组 nums 。如果任一值在数组中出现 至少两次 ，返回 true ；如果数组中每个元素互不相同，返回 false 。
 *
 *
 * 示例 1：
 *
 * 输入：nums = [1,2,3,1]
 * 输出：true
 * 示例 2：
 *
 * 输入：nums = [1,2,3,4]
 * 输出：false
 * 示例3：
 *
 * 输入：nums = [1,1,1,3,3,4,3,2,4,2]
 * 输出：true
 *
 *
 * 提示：
 *
 * 1 <= nums.length <= 10^5
 * -10^9 <= nums[i] <= 10^9
 */
public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {
        /*List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            list.add(num);
        }
        Map<Integer, List<Integer>> collect = list.stream().collect(Collectors.groupingBy(Integer::new));
        for (Map.Entry<Integer, List<Integer>> integerListEntry : collect.entrySet()) {
            List<Integer> value = integerListEntry.getValue();
            if (value.size() >= 2) {
                return true;
            }
        }
        return false;*/
        System.out.println(Arrays.stream(nums).distinct().count());
        return Arrays.stream(nums).distinct().count() < nums.length;
    }

    public static void main(String[] args) {
        ContainsDuplicate duplicate = new ContainsDuplicate();
        int[] nums = new int[]{1,2,3,1};
        System.out.println(duplicate.containsDuplicate(nums));
        nums = new int[]{1,2,3,4};
        System.out.println(duplicate.containsDuplicate(nums));
        nums = new int[]{1,1,1,3,3,4,3,2,4,2};
        System.out.println(duplicate.containsDuplicate(nums));
    }
}
