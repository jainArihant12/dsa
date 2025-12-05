// Question 2:
// Problem 205 — Isomorphic Strings

// You are given two strings s and t.
// Determine whether the two strings are isomorphic.

// Two strings are called isomorphic if the characters in string s can be replaced to get string t, with the following rules:

// Each character in s must map to exactly one character in t.

// No two different characters in s can map to the same character in t.

// The mapping must be consistent across the string.


// In simpler words:
// You should be able to transform s into t by replacing characters, but without breaking the one-to-one mapping rule.

// Example 1

// Input:
// s = "egg", t = "add"
// Output:
// true
// Explanation: e → a, g → d

// Example 2

// Input:
// s = "foo", t = "bar"
// Output:
// false

// Example 3

// Input:
// s = "paper", t = "title"
// Output:
// true

package DAY_05_12_25;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Problem2 {
    public boolean isIsomorphic(String s, String t) {
        Map<Character,Character> map = new HashMap<>();
        HashSet<Character> set = new HashSet<>();
        for(int i=0;i<s.length();i++){
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);
            if(!map.containsKey(ch1)){
                map.put(ch1,ch2);
                if(!set.contains(ch2))
                set.add(ch2);
                else
                return false;
            }
            else if(map.get(ch1)!=ch2 ){
                return false;
            }
            
        }
        return true;
    }
}
