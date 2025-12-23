//  GFG

// Nearly sorted

// Given an array arr[], where each element is at most k positions away from its correct position in the sorted order.
// Your task is to restore the sorted order of arr[] by rearranging the elements in place.

// Note: Don't use any sort() method.

// Examples:

// Input: arr[] = [2, 3, 1, 4], k = 2
// Output: [1, 2, 3, 4]
// Explanation: All elements are at most k = 2 positions away from their correct positions.
// Element 1 moves from index 2 to 0
// Element 2 moves from index 0 to 1
// Element 3 moves from index 1 to 2
// Element 4 stays at index 3
// Input: arr[]= [7, 9, 14], k = 1
// Output: [7, 9, 14]
// Explanation: All elements are already stored in the sorted order.

package Heap;

import java.util.PriorityQueue;

public class problem2 {
    public  static void nearlySorted(int[] arr, int k) {
        // code here 
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int i=0;i<k;i++){
            minHeap.offer(arr[i]);
        }
        int j=0;
        for(int i=k;i<arr.length;i++){
            minHeap.offer(arr[i]);
            arr[j] = minHeap.remove();
            j++;
        }
        for(int i=0;i<k;i++){
            arr[j]=minHeap.remove();
            j++;
        }
    }
    public static void main(String[] args) {
        int arr[] = {2, 3, 1, 4};
        int k=2;
        nearlySorted(arr,k);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
