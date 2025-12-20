package Binary_Search;

// What is the “Search Insert Position” question?

// Given a sorted array of distinct integers and a target value,
// return the index if the target is found.
// If not found, return the index where it should be inserted to keep the array sorted.

// 📌 Example
// Example 1
// nums = [1,3,5,6], target = 5
// Output: 2


// 5 exists at index 2

// Example 2
// nums = [1,3,5,6], target = 2
// Output: 1


// 2 should be inserted at index 1

// Example 3
// nums = [1,3,5,6], target = 7
// Output: 4

public class problem2 {
    public static void main(String[] args) {
        int arr[] = {1,2,2,2,5,5,6,7,7,8};
        int start = 0;
        int end = arr.length-1;
        int target = 3;
        int idx = -1;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(arr[mid]==target){
                idx=mid;
                break;
            }else if(arr[mid]>target){
                 end = mid-1;
            }else{
                start = mid+1;
            }
        }

        if(idx==-1)
            System.out.println(start);
        else
            System.out.println(idx);
    }
}
