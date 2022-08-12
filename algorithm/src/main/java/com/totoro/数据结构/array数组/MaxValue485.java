package com.totoro.数据结构.array数组;

/**
 * @Description: 给定一个二进制数组 nums ， 计算其中最大连续 1 的个数。
 * @author: zhaoyan
 * @Date: 2022/07/31 18:40
 */
public class MaxValue485 {
    public static void main(String[] args) {
        System.out.println(maxValue(new int[]{1,1,0,1,1,1}));
    }

    /**
     * 思路：记录结果值res和当前最大值curMax
     *
     * @param nums 数组
     * @return 最大连续1的个数
     */
    public static int maxValue(int[] nums) {
        int res = 0;
        int curMax = 0;
        for (int j : nums) {
            if (j == 1) {
                curMax++;
            } else {
                res = Math.max(res, curMax);
                curMax = 0;
            }
        }
        return Math.max(res, curMax);
    }
}
