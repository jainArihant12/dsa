package DAY_14_12_25;
// leetcode 33 
public class Problem {
    public int search(int[] nums, int target) {
        int pivot = pivortSearch(nums);

        // Case 1: array not rotated
        if (pivot == -1) {
            return binarySearch(nums, target, 0, nums.length - 1);
        }

        // Case 2: target is pivot element
        if (nums[pivot] == target) {
            return pivot;
        }

        // Case 3: decide which side to search
        if (target >= nums[0]) {
            return binarySearch(nums, target, 0, pivot - 1);
        }

        return binarySearch(nums, target, pivot + 1, nums.length - 1);
    }

    public int pivortSearch(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid < end && nums[mid] > nums[mid + 1])
                return mid;

            if (mid > start && nums[mid] < nums[mid - 1])
                return mid - 1;

            if (nums[start] >= nums[mid])
                end = mid - 1;
            else
                start = mid + 1;
        }
        return -1;
    }

    public int binarySearch(int[] nums, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) return mid;
            else if (nums[mid] < target) start = mid + 1;
            else end = mid - 1;
        }
        return -1;
    }
}
