//  Leetcode 347 Top K frequent Elements

// Given an integer array nums and an integer k, return the k most frequent elements. 
// You may return the answer in any order.


// Example 1:
// Input: nums = [1,1,1,2,2,3], k = 2
// Output: [1,2]

// Example 2:
// Input: nums = [1], k = 1
// Output: [1]

// Example 3:
// Input: nums = [1,2,1,2,1,2,3,1,3,2], k = 2
// Output: [1,2]

// O(nlogk)

package Heap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class problem4 {
    public static int[] topKFrequent(int[] nums, int k) {
        int ans[] = new int[k];
       Map<Integer,Integer> map = new HashMap<>();
       PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> Integer.compare(a[1], b[1]));
       for(int i=0;i<nums.length;i++){
        map.put(nums[i],map.getOrDefault(nums[i],0)+1);
       }
       for(int key : map.keySet()){
        minHeap.offer(new int[]{key,map.get(key)});
        if(minHeap.size()>k){
            minHeap.poll();
        }
       }
        for(int i=0;i<k;i++){
            int top[] = minHeap.poll();
            ans[i] = top[0];
        }
        return ans;

    }
    public static void main(String[] args) {
        int[] nums = {1,2,1,2,1,2,3,1,3,2};
        int k = 2;
        int ans[];
        ans=topKFrequent(nums,k);
        System.out.println(Arrays.toString(ans));
    }
}
