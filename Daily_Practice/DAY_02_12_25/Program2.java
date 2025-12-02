package DAY_02_12_25;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Program2 {
    public String frequencySort(String s) {
        Map<Character,Integer> map = new HashMap<>();
        String ans = "";
        int n = s.length();
        for(int i=0;i<n;i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        List<Map.Entry<Character,Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.<Character, Integer>comparingByValue().reversed());
        for(Map.Entry<Character,Integer> l : list){
            for(int i=0;i<l.getValue();i++){
                ans += l.getKey();
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        
    }
}
