// Question 1:

// Given an array of integers where every element appears exactly twice except for one element, which appears only once, find and return the element that appears only one time.

// Test Cases:

// 1. Input: [2, 3, 2, 4, 4]
// Output: 3


// 2. Input: [7, 7, 9]
// Output: 9

// Leetcode - 136
public class Problem1 {
    public static int singleNumber(int[] nums) {
        int n = nums.length;
        int ans=0;
        for(int i=0;i<n;i++){
            ans^=nums[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        int nums[] = {1,2,1,3,6,6,3};
        int ans = singleNumber(nums);
        System.out.println(ans);
    }
}