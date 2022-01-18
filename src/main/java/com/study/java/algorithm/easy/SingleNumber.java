package com.study.java.algorithm.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SingleNumber {

    public int singleNumber(int[] nums) {
        /*List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            list.add(num);
        }
        Map<Integer, List<Integer>> collect = list.stream().collect(Collectors.groupingBy(Integer::new));
        for (Map.Entry<Integer, List<Integer>> integerListEntry : collect.entrySet()) {
            List<Integer> value = integerListEntry.getValue();
            if (value.size() == 1) {
                return value.get(0);
            }
        }
        return 0;*/
        int single = 0;
        for (int num : nums) {
            single ^= num;
        }
        return single;
    }

    public static void main(String[] args) {
        SingleNumber number = new SingleNumber();
        int[] nums = new int[]{4,1,2,1,2};
        System.out.println(number.singleNumber(nums));

        nums = new int[]{2,2,1};
        System.out.println(number.singleNumber(nums));

        nums = new int[]{1,1,2};
        System.out.println(number.singleNumber(nums));
    }
}
