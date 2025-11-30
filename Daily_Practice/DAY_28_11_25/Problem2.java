
// Given a string, return the length of the longest substring that contains no repeating characters.

// Test Cases:

// 1. Input: "pwwkew"
// Output: 3
// (Longest substring: "wke")

// 2. Input: "abcdabc"
// Output: 4
// (Longest substring: "abcd")


// Leetcode - 3

import java.util.HashSet;

public class Problem2 {
     public static int lengthOfLongestSubstring(String s) {
        HashSet<Character> map =  new HashSet<>();
        int i=0;
        int j=0;
        int n = s.length();
        int max=0;
        while(j<n){
            char ch1 = s.charAt(j);
           while(map.contains(ch1)){
            char ch2 = s.charAt(i);
            map.remove(ch2);
            i++;
           }
           max = Math.max(max,j-i+1);
           map.add(ch1);
           j++;
        }
        return max;
    }
    public static void main(String[] args) {
        String s = "abcdabc";
        int ans  = lengthOfLongestSubstring(s);
        System.out.println(ans);
        }
}
