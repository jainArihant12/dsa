//Leetcode 22


// Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

 

// Example 1:

// Input: n = 3
// Output: ["((()))","(()())","(())()","()(())","()()()"]
// Example 2:

// Input: n = 1
// Output: ["()"]
 
package DAY_08_12_25;

import java.util.ArrayList;
import java.util.List;

public class Problem2 {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        GenPar(ans,0,0,"",n);
        return ans;
    }
    public static void GenPar(List<String> ans , int op ,int cl , String Para,int n){
        if(Para.length()==n*2){
            ans.add(Para);
            return;
        }
        if(op<cl) return;
        if(op<n)
        GenPar(ans,op+1,cl,Para+'(',n);
        if(cl<op)
        GenPar(ans,op,cl+1,Para+')',n);
    }
}
