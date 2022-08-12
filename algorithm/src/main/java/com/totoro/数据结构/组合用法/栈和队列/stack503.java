package com.totoro.数据结构.组合用法.栈和队列;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Stack;

public class stack503 {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,1};
        System.out.println("开始执行");
        nums = next2(nums);
        System.out.println("执行结束");
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
    public static int[] next2(int[] nums) {
        int len = nums.length;
        int[] res = new int[len];
        Arrays.fill(res, -1);
        // stack存数组下标
        Stack<Integer> stack = new Stack<Integer>();
        for (int i = 0; i < 2 * len; i++) {
            while (!stack.empty() && nums[i % len] > nums[stack.peek()]) {
                res[stack.pop()] = nums[i % len];
            }
            if (i < len) {
                stack.push(i % len);
            }
        }
        return res;
    }

    public int[] nextGreaterElements3(int[] nums) {
        int[] res = new int[nums.length];
        Stack<Integer> stack = new Stack<Integer>();
        for (int i = 0; i < nums.length; i++) {
            int j = i + 1;
            stack.push(nums[i]);
            while (stack.size() < nums.length) {
                if (nums[j % nums.length] <= stack.firstElement()) {
                    stack.push(nums[j % nums.length]);
                } else {
                    res[i] = nums[j % nums.length];
                    break;
                }
                j++;
            }
            if (stack.size() == nums.length) {
                res[i] = -1;
            }
            stack.removeAllElements();
        }
        return res;
    }

    //单调栈二
    public static int[] next(int[] nums) {
        int[] res = new int[nums.length];
        Stack<Integer> stack = new Stack<Integer>();
        for (int i = 0; i < nums.length; i++) {
            int j = i + 1;
            stack.push(nums[i]);
            while (stack.size() < nums.length && !stack.empty()) {
                if (nums[j % nums.length] > stack.firstElement()) {
                    res[j % nums.length - 1] = nums[j % nums.length];
                    stack.pop();
                } else {
                    stack.push(nums[j % nums.length]);
                    j++;
                }
            }
            if (stack.size() == nums.length) {
                res[i] = -1;
            }
        }
        return res;
    }
    // 单调栈一
    public static int[] nextGreaterElements1(int[] nums) {
        // 初始化返回的数组
        int len = nums.length;
        int[] arr = new int[len];
        Arrays.fill(arr, -1);

        // 处理栈
        int top = -1;
        int[] stack = new int[len];
        for (int i = 0; i < len; i++) {
            while (top > -1 && nums[i % len] > nums[stack[top]]) {
                arr[stack[top - 1]] = nums[i % len];
                if (i < len) {
                    stack[++top] = i;
                }
            }
        }
        return arr;
    }
    // 我的解法
    public static int[] nextGreaterElements(int[] nums) {
        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
            // 1.从i的下一个开始比较
            int j = i;
            int t = 0;
            while (j < nums.length && t < nums.length) {
                // 2.找第一个大于nums[i]的数
                if (nums[j] > nums[i]) {
                    arr[i] = nums[j%nums.length];
                    break;
                }
                j++;
                t++;
                if (j == nums.length) {
                    j = 0;
                }
                if (t == nums.length) {
                    arr[i] = -1;
                    break;
                }
            }
        }
        return arr;
    }
}
