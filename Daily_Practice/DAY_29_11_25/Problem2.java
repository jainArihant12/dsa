// Question 2: Longest Subarray With Sum ≤ K

// Problem:
// You are given an integer array nums and an integer k.
// Return the length of the longest subarray whose sum is less than or equal to k.

// Example 1

// Input: nums = [2, 1, 3, 1, 1, 1], k = 5
// Output: 4

// Explanation:
// The longest subarray with sum ≤ 5 is:
// [1, 3, 1] → sum = 5 (length 3)
// [1, 1, 1, 1] → sum = 4 (length 4) ← longest

// Example 2

// Input: nums = [4, 2, 2, 1], k = 6
// Output: 2
// Explanation: [4,2] → 6


public class Problem2 {
    public static void main(String[] args) {
        int arr[] = {1,1,20,1,3,-1,1,1,1,0};
        int k=8;
        int i = 0;
        int j = 0;
        int sum = 0;
        int max =0;
        while(j<arr.length){
            sum += arr[j];
            if(sum > k){
                sum -= arr[i];
                i++;
            }
            max = Math.max(max , j-i+1);
            j++;
        }
        System.out.println(max);
    }
}
