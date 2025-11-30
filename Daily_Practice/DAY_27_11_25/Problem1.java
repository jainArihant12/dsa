// Question 1: Count the Number of Consecutive Sequences

// You are given an unsorted array of integers.
// Your task is to count how many consecutive sequences exist in the array.

// A consecutive sequence is a group of numbers that appear in increasing order with a difference of exactly 1 between adjacent values.

// Example 1
// Input: [4, 2, 1, 6, 5]
// Consecutive sequences are:
// 1, 2
// 4,5, 6
// So the output is: 2

// Example 2
// Input:[10, 11, 12, 50, 100, 101]
// Consecutive sequences:
// 10, 11, 12
// 50
// 100, 101
// Output:3

package DAY_27_11_25;
import java.util.*;
public class Problem1 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 5, 7, 8};
        Arrays.sort(arr);

        int count = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - arr[i - 1] != 1) {
                count++;
            }
        }

        System.out.println(count);
    }
}
