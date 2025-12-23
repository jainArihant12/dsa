// K th smallest element

package Heap;

import java.util.PriorityQueue;

public class problem1 {
    public static void main(String[] args) {
        int arr[] = {1,6,3,8,4,2,9,7,5};
        int k=4;
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b)->b-a);
        for(int i =0;i<k;i++){       
            maxHeap.offer(arr[i]);
        }
        for(int i=k;i<arr.length;i++){
            if(maxHeap.peek()> arr[i]){   
                maxHeap.remove();
                maxHeap.add(arr[i]);
            }
        }
        System.out.println(maxHeap.peek());
    }
}

// Time Complexity O(nlogk)
// n for iteration and log k for removal for each N element;
// Space Complexity O(k)