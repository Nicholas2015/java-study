package com.study.java.algorithm.easy;

import com.alibaba.fastjson.JSON;

/**
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 *
 * 示例:
 *
 * 输入: [0,1,0,3,12]
 * 输出: [1,3,12,0,0]
 * 说明:
 *
 * 必须在原数组上操作，不能拷贝额外的数组。
 * 尽量减少操作次数。
 *
 */
public class MoveZeroes {

    public void moveZeroes(int[] nums) {
        int length = nums.length;
        if (length == 0) {
            return;
        }
        int index = 0;
        for (int i = 0; i < length; i++) {
            if (nums[i] != 0) {
                nums[index] = nums[i];
                index++;
            }
        }
        for (int i = index; i < length; i++) {
            nums[i] = 0;
        }
        System.out.println(JSON.toJSONString(nums));
    }



    public static void main(String[] args) {
        MoveZeroes zeroes = new MoveZeroes();
        int[] nums = new int[]{0,1,0,3,12};
        zeroes.moveZeroes(nums);

        nums = new int[]{73348,66106,-85359,53996,18849,-6590,-53381,-86613,-41065,83457,0};
        zeroes.moveZeroes(nums);
    }
}
