package com.totoro.数据结构.array数组;

/**
 * @Description:
 * @author: zhaoyan
 * @Date: 2022/07/31 18:43
 */
public class MoveArr283 {

    public static void main(String[] args) {
        moveZeroes02(new int[]{0,1,2,4,0,0,9,8});
    }

    /**
     * 解法1：快慢指针：l：记录0的位置，r：记录非0的位置
     * @param nums
     */
    public static void moveZeroes(int[] nums) {
        int left = 0;
        int right = 0;
        while (left <= right && right < nums.length) {
            while (left < nums.length && nums[left] != 0) { // 找到左指针 == 0的位置，todo：注意left的边界
                left++;
            }
            right = left + 1;
            if (right >= nums.length) {
                break;
            }
            while (right < nums.length && nums[right] == 0) { // 找到右指针 != 0的位置
                right++;
            }
            if (right >= nums.length) {
                break;
            }
            nums[left] = nums[right];
            nums[right] = 0;
        }
        printStr(nums);
    }

    public static void printStr(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print("\t" + nums[i]);
        }
    }

    /**
     * 解法二：记录0下标的位置
     * @param nums
     */
    public static void moveZeroes02(int[] nums){
        int tmp = -1;
        for (int i = 0; i < nums.length; i++) {
            if (tmp == -1 && nums[i] == 0) {
                tmp = i; // 记录0的位置
            } else if (nums[i] != 0 && tmp != -1) {
                    nums[tmp] = nums[i];
                    nums[i] = 0; // 将非0交换到前面
                    tmp++;
                    if (nums[tmp] != 0) { // 0的位置前进一位
                        tmp = -1;
                    }
            }
        }
        printStr(nums);
    }

}
