package com.study.java.algorithm.easy;

import com.alibaba.fastjson.JSON;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

/**
 * 旋转数组
 * 给你一个数组，将数组中的元素向右轮转 k个位置，其中k是非负数。
 * <p>
 * <p>
 * <p>
 * 示例 1:
 * <p>
 * 输入: nums = [1,2,3,4,5,6,7], k = 3
 * 输出: [5,6,7,1,2,3,4]
 * 解释:
 * 向右轮转 1 步: [7,1,2,3,4,5,6]
 * 向右轮转 2 步: [6,7,1,2,3,4,5]
 * 向右轮转 3 步: [5,6,7,1,2,3,4]
 * 示例2:
 * <p>
 * 输入：nums = [-1,-100,3,99], k = 2
 * 输出：[3,99,-1,-100]
 * 解释:
 * 向右轮转 1 步: [99,-1,-100,3]
 * 向右轮转 2 步: [3,99,-1,-100]
 * <p>
 * <p>
 * 提示：
 * <p>
 * 1 <= nums.length <= 105
 * -231 <= nums[i] <= 231 - 1
 * 0 <= k <= 105
 * <p>
 * <p>
 * 进阶：
 * <p>
 * 尽可能想出更多的解决方案，至少有 三种 不同的方法可以解决这个问题。
 * 你可以使用空间复杂度为O(1) 的原地算法解决这个问题吗？
 */
public class Rotate {

    /*public void rotate(int[] nums, int k) {
        int length = nums.length;
        for (int i = 0; i < k; i++) {
            int[] ints = Arrays.copyOfRange(nums, 0, length - 1);
            nums[0]=nums[length-1];
            for (int j = 0; j < ints.length; j++) {
                nums[j+1]=ints[j];
            }
            System.out.println(JSON.toJSONString(nums));
        }
    }*/

    public void rotate(int[] nums, int k) {
        int length = nums.length;
        int[] array = new int[length];

        for (int j = 0; j < nums.length; j++) {
            array[(j + k) % length] = nums[j];
        }
        System.arraycopy(array, 0, nums, 0, length);
    }

    public static void main(String[] args) {
        Rotate rotate = new Rotate();
        int[] nums = new int[]{1,2,3,4,5,6,7};
        int k = 3;
        rotate.rotate(nums,k);

        nums = new int[]{-1, -100, 3, 99};
        k = 2;
        rotate.rotate(nums,k);
    }
}
