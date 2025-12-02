package DAY_02_12_25;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Program1 {
    class Solution {
    public List<String> letterCombinations(String digits) {
        Map<Character,String[]> map  = new HashMap<>();
        List<String> ans = new ArrayList<>();
        map.put('2',new String[]{"a","b","c"});
        map.put('3',new String[]{"d","e","f"});
        map.put('4',new String[]{"g","h","i"});
        map.put('5',new String[]{"j","k","l"});
        map.put('6',new String[]{"m","n","o"});
        map.put('7',new String[]{"p","q","r","s"});
        map.put('8',new String[]{"t","u","v"});
        map.put('9',new String[]{"w","x","y","z"});
        PhoneCombo(ans,map,digits.toCharArray(),0,"");
        return ans;
       
    }
    public static void PhoneCombo(List<String> ans ,  Map<Character,String[]> map,char[] digit ,int k,String str){
        if(k==digit.length){
            ans.add(str);
            return;
        }

        for(int i =0;i<map.get(digit[k]).length;i++){
            if(map.containsKey(digit[k])){
                String[] arr = map.get(digit[k]);
                PhoneCombo(ans ,map,digit,k+1,str+arr[i]);
            }
        }
    }

}
}
