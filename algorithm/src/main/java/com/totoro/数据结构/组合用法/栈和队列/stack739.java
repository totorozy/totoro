package com.totoro.数据结构.组合用法.栈和队列;

import java.util.Arrays;
import java.util.Stack;

public class stack739 {
    public static void main(String[] args) {
        int[] nums = new int[]{73, 74, 75, 71, 69, 72, 76, 73};
        nums = dailyTemperatures(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
    public static int[] dailyTemperatures(int[] T) {
        int len = T.length;
        int[] res = new int[len];
        Arrays.fill(res, 0);
        Stack<Integer> stack = new Stack();
        for (int i = 0; i < len ; i++) {
            int curr = T[i];
            while (!stack.empty() && curr > T[stack.peek()]) {
                res[stack.peek()] = i - stack.peek();
                stack.pop();
            }
            stack.push(i);
        }
        return res;
    }
}
