// Question 1:

// Problem 49 — Group Anagrams

// You are given a list of strings.
// Your task is to group together all the strings that are anagrams of each other.

// Two strings are considered anagrams if they contain the same characters with the same frequencies, just arranged in a different order.

// You should return the result as a list of groups, where each group contains strings that are anagrams.

// Example

// Input:
// ["eat", "tea", "tan", "ate", "nat", "bat"]

// Output (order may vary):
// [["eat","tea","ate"], ["tan","nat"], ["bat"]]

package DAY_05_12_25;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Problem1 {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        List<List<String>> ans = new ArrayList<>();
        String s;
        char[] arr;

        for(int i=0; i<strs.length; i++) {
            arr = strs[i].toCharArray();
            Arrays.sort(arr);
            s = new String(arr);
            if(!map.containsKey(s)) {
                List<String> list = new ArrayList<>();
                map.put(s, list);
                ans.add(list);
            }
            map.get(s).add(strs[i]);
        }
        
        
        return ans;
    }
}
