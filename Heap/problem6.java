// Leetcode 973. K Closest Points to Origin

// Given an array of points where points[i] = [xi, yi] represents a point on the X-Y plane and an integer k, return the k closest points to the origin (0, 0).
// The distance between two points on the X-Y plane is the Euclidean distance (i.e., √(x1 - x2)2 + (y1 - y2)2).
// You may return the answer in any order. The answer is guaranteed to be unique (except for the order that it is in).

// Example 2:
// Input: points = [[3,3],[5,-1],[-2,4]], k = 2
// Output: [[3,3],[-2,4]]
// Explanation: The answer [[-2,4],[3,3]] would also be accepted.

package Heap;

import java.util.Arrays;
import java.util.PriorityQueue;

public class problem6 {
    static class Pair{
        int x;
        int y;
        double dis;
        Pair(int x,int y,double dis){
            this.x=x;
            this.y=y;
            this.dis=dis;
        }
    }
    public static int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Pair> maxHeap = new PriorityQueue<>((a,b)->Double.compare(b.dis,a.dis));
        int[][] ans = new int[k][2];
        for(int[] point : points){
            double dist = Math.sqrt(Math.pow(point[0],2)+Math.pow(point[1],2));
            maxHeap.offer(new Pair(point[0],point[1],dist));
            if(maxHeap.size()>k){
                maxHeap.remove();
            }
        }
        for(int i=0;i<ans.length;i++){
            Pair curr = maxHeap.poll();
            int x =curr.x;
            int y = curr.y;
            ans[i][0]=x;
            ans[i][1]=y;
        }
        return ans;
    }
    public static void main(String[] args) {
        int points[][] = {{3,3},{5,-1},{-2,4}};
        int k=2;
        int[][] a = kClosest(points,k);
        System.out.print(Arrays.deepToString(a));

    }
}
