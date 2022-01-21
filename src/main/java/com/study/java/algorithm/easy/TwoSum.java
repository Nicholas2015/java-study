package com.study.java.algorithm.easy;

import com.alibaba.fastjson.JSON;

/**
 * 两数之和
 * 给定一个整数数组 nums和一个整数目标值 target，请你在该数组中找出 和为目标值 target 的那两个整数，并返回它们的数组下标。
 * <p>
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
 * <p>
 * 你可以按任意顺序返回答案。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入：nums = [2,7,11,15], target = 9
 * 输出：[0,1]
 * 解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
 * 示例 2：
 * <p>
 * 输入：nums = [3,2,4], target = 6
 * 输出：[1,2]
 * 示例 3：
 * <p>
 * 输入：nums = [3,3], target = 6
 * 输出：[0,1]
 * <p>
 * <p>
 * 提示：
 * <p>
 * 2 <= nums.length <= 104
 * -109 <= nums[i] <= 109
 * -109 <= target <= 109
 * 只会存在一个有效答案
 * 进阶：你可以想出一个时间复杂度小于 O(n2) 的算法吗？
 */
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[]{0,0};
        for (int i = 0; i < nums.length - 1; i++) {
            int num1 = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                int num2 = nums[j];
                if ((num1 + num2) == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }


    public static void main(String[] args) {
        TwoSum sum = new TwoSum();
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        System.out.println(JSON.toJSONString(sum.twoSum(nums, target)));

        nums = new int[]{3, 2, 4};
        target = 6;
        System.out.println(JSON.toJSONString(sum.twoSum(nums, target)));

        nums = new int[]{3, 3};
        target = 6;
        System.out.println(JSON.toJSONString(sum.twoSum(nums, target)));

        nums = new int[]{2,7,11,15};
        target = 9;
        System.out.println(JSON.toJSONString(sum.twoSum(nums, target)));
    }
}
