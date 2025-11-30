// Question 1: Count Vowels in Substring

// Given a string s and an integer k, return the maximum number of vowels in any substring of length k.

// Vowels are: a, e, i, o, u.

// Example:

// Input: s = "abciiidef", k = 3  
// Output: 3  
// Explanation: Substring "iii" has 3 vowels.

// Input: s = "abciiidef", k = 3
// Output: 3

// LeetCode 1456

public class Problem1 {
    public static  int maxVowels(String s, int k) {
        int i=0;
        int j=0;
        int n = s.length();
        int max = 0;
        int count = 0;
        while(j<n){
            char ch = s.charAt(j);
            if(ch=='a' || ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                count++;
            }
            max = Math.max(max,count);
            if(k==j-i+1){
                char ch2 = s.charAt(i);
                if(ch2=='a' || ch2=='e'||ch2=='i'||ch2=='o'||ch2=='u'){
                    count--;
                }
                i++;
           }
           j++;
        }
        return max;
    }
    public static void main(String[] args) {
        String s = "abciiidef";
        int k = 3;
        int ans = maxVowels(s,k);
        System.out.println(ans);
    }
}
