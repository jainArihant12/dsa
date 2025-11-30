// Question 2:

// You are given two strings.
// Your task is to determine whether the two strings are anagrams of each other.

// Two strings are considered anagrams if:

// They contain the same characters

// With the same frequency

// In any order

// Example 1
// Input:
// s1 = "listen"
// s2 = "silent"

// Output: True

// Leetcode :242
package DAY_27_11_25;

import java.util.HashMap;

public class Problem2 {
    public static boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> map = new HashMap<>();
        boolean ans = true;
        if(s.length()!= t.length()){
            return false;
        }
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<t.length();i++){
            char ch = t.charAt(i);
            if(map.containsKey(ch)){
                int a = map.get(ch)-1;
                map.put(ch,a);
                if(a<0){
                    ans = false;
                     break;
                }
            }else{
                ans = false;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String s= "listen";
        String t= "silent";
        System.out.println(isAnagram(s, t));

    }
}
