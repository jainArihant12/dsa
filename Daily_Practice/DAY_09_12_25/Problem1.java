// You are given a string s consisting of lowercase English letters.

// Return an integer denoting the maximum number of substrings you can split s into such that each substring starts with a distinct character (i.e., no two substrings start with the same character).

// Example 1:

// Input: s = "abab"

// Output: 2

// Explanation:

// Split "abab" into "a" and "bab".
// Each substring starts with a distinct character i.e 'a' and 'b'. Thus, the answer is 2.
// Example 2:

// Input: s = "abcd"

// Output: 4

// Explanation:
// Split "abcd" into "a", "b", "c", and "d".
// Each substring starts with a distinct character. Thus, the answer is 4.
// Example 3:
// Input: s = "aaaa"
// Output: 1

// Explanation:
// All characters in "aaaa" are 'a'.
// Only one substring can start with 'a'. Thus, the answer is 1.

package DAY_09_12_25;

public class Problem1 {
    public int maxDistinct(String s) {
        int [] ans = new int[26];
        int count = 0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ans[ch-'a']==0){
                ans[ch-'a']=1;
                count++;
            }
        }
        return count;
    }
}
