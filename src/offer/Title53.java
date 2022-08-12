package offer;

/*
剑指 Offer 53 - I. 在排序数组中查找数字 I
统计一个数字在排序数组中出现的次数。

示例 1:

输入: nums = [5,7,7,8,8,10], target = 8
输出: 2
示例 2:

输入: nums = [5,7,7,8,8,10], target = 6
输出: 0

提示：

0 <= nums.length <= 105
-109 <= nums[i] <= 109
nums 是一个非递减数组
-109 <= target <= 109
 */
public class Title53 {

    public static void main(String[] args) {
        Solution solution = new Solution();
    }

    static class Solution {
        public int search(int[] nums, int target) {
            int result = 0;
            for (int num : nums) {
                if (num == target) result++;
            }
            return result;
        }
    }
}
