package com.totoro.数据结构.组合用法.排序和字符串;

import java.util.Arrays;
import java.util.Comparator;

public class le179 {

    public static void main(String[] args) {
        //int[] nums = new int[]{18,28,19};
        int[] nums = {18,28,19};
        String result = large(nums);
        System.out.println(result);
    }
    public static String large(int[] nums) {
        String[] str = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            str[i] = nums[i] + "";
        }
        Arrays.sort(str, new Comparator<String>() {
            public int compare(String o1, String o2) {
                System.out.println();
                System.out.println(o1 + " " + o2);
                int re =(o2 + o1).compareTo(o1 + o2);
                System.out.println(re);
                System.out.println();
                return re;
            }
        });

        // 法一：将字符数组->字符串 转化
//        StringBuilder sb = new StringBuilder();
//        for (String st : str) {
//            sb.append(st);
//        }
//        String result = sb.toString();
        // 法二
        String result = "";
        for (String st : str) {
            result = result + st;
        }
        if (result.charAt(0) == '0') {
            result = "0";
        }
        return result;
    }
    public static String largestNumber(int[] nums) {
        String s = "";
        for (int i = 0; i < nums.length; i++) {
            s = s + nums[i];
        }
        int[] data = new int[10];
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            //data[Integer.parseInt(String.valueOf(s.charAt(i)))]++;
            data[(int)(s.charAt(i)) - (int)('0')]++;
        }

        for (int i = 9; i > -1; i--) {
            if (data[i] != 0) {
                for (int j = 0; j < data[i]; j++) {
                    res = res + i;
                    System.out.println(data[i]);
                }
            }
        }
        return res;
    }
}
