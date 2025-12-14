package DAY_14_12_25;
// Leetcode 153
public class Problem2 {
    public int findMin(int[] nums) {
        int start = 0;
        int end = nums.length-1;
       
        while(start<end){
            int mid = start + (end-start)/2;
            if(nums[mid]>nums[end]){
                start = mid+1;
            }else if(nums[mid]<=nums[end]){
                end = mid;
            }
        }
        return nums[start];
    }
}
