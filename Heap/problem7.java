// GFG -- Connect n ropes with minimum cost

// Given an array arr[] of rope lengths, connect all ropes into a single rope with the minimum total cost. The cost to connect two ropes is the sum of their lengths.

// Examples:

// Input: arr[] = [4, 3, 2, 6]
// Output: 29
// Explanation:  Minimum cost to connect all ropes into a single rope is 
// Connect ropes 2 and 3 - [4, 5, 6], cost = 5
// Connect ropes 4 and 5 - [9, 6], cost = 9
// Connect ropes 9 and 6 - [15], cost = 15
// Total cost = 5 + 9 + 15 = 29 

// by sorting it will : O(n^2logn)
// by heap : O(nlogn)

package Heap;

import java.util.PriorityQueue;

public class problem7 {
    static int minCost(int[] arr) {

        // Create a min priority queue
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int num : arr) {
            pq.add(num);
        }

        // Initialize result
        int res = 0;

        // While size of priority queue is more than 1
        while (pq.size() > 1) {

            // Extract shortest two ropes from pq
            int first = pq.poll();
            int second = pq.poll();

            // Connect the ropes: update result and
            // insert the new rope to pq
            res += first + second;
            pq.add(first + second);
        }

        return res;
    }

    public static void main(String[] args) {
        int ans[] = {4, 3, 2, 6};
        System.out.println(minCost(ans));
    }
}
