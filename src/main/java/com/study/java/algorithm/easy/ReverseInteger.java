package com.study.java.algorithm.easy;

/**
 * 整数反转
 * 给你一个 32 位的有符号整数 x ，返回将 x 中的数字部分反转后的结果。
 *
 * 如果反转后整数超过 32 位的有符号整数的范围 [−231,  231 − 1] ，就返回 0。
 *
 * 假设环境不允许存储 64 位整数（有符号或无符号）。
 *  
 *
 * 示例 1：
 *
 * 输入：x = 123
 * 输出：321
 * 示例 2：
 *
 * 输入：x = -123
 * 输出：-321
 * 示例 3：
 *
 * 输入：x = 120
 * 输出：21
 * 示例 4：
 *
 * 输入：x = 0
 * 输出：0
 *  
 *
 * 提示：
 *
 * -2^31 <= x <= 2^31 - 1
 * @author Administrator
 */
public class ReverseInteger {

    public int reverse(int x) {

       try {
           if (Math.pow(-2.0,31) < x && (Math.pow(2.0,31) - 1) > x) {

               StringBuffer sb = new StringBuffer();
               sb.append(Math.abs(x));
               int result = Integer.parseInt(sb.reverse().toString());
               if (x < 0) {
                   result = -result;
                   return result;
               }

               return result;
           }
       } catch (NumberFormatException e) {
           return 0;
       }
        return 0;
  }

    public static void main(String[] args) {
        ReverseInteger integer = new ReverseInteger();

        int x = 123;
        System.out.println(integer.reverse(x));

        x = -123;
        System.out.println(integer.reverse(x));

        x = 120;
        System.out.println(integer.reverse(x));

        x = 0;
        System.out.println(integer.reverse(x));
    }
}
