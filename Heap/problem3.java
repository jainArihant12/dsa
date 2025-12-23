// Leetcode 658 Find the K closest Element
package Heap;

import java.util.*;

public class problem3 {
    public static List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a,b)->{
            if(a[0]!=b[0]) return b[0]-a[0];
            return b[1]-a[1];
        });
        List<Integer> ans = new ArrayList<>();
        for(int i=0;i<k;i++){
            maxHeap.offer(new int[]{Math.abs(x-arr[i]),arr[i]});
        } 
        for(int i=k;i<arr.length;i++){
           int dist = Math.abs(x - arr[i]);
            int[] top = maxHeap.peek();

            if (top[0] > dist){
                maxHeap.remove();
                maxHeap.offer(new int[]{Math.abs(x-arr[i]),arr[i]});
            }
        }
        for(int i=0;i<k;i++){
            int[] top = maxHeap.remove();
            ans.add(top[1]);
        }
        Collections.sort(ans);
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int k = 4;
        int x = 3;
        List<Integer> ans = new ArrayList<>();
        ans = findClosestElements(arr,k,x);
        System.out.println(ans);
    }
}
