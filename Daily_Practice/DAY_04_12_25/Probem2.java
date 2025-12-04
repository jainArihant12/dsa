// Leetcode 20. Valid Parentheses

// Leetcode 20. Valid Parentheses
// Question 2:
// Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

// An input string is valid if:

// Open brackets must be closed by the same type of brackets.
// Open brackets must be closed in the correct order.
// Every close bracket has a corresponding open bracket of the same type.
 

// Example 1:

// Input: s = "()"

// Output: true

// Example 2:

// Input: s = "()[]{}"

// Output: true

// Example 3:

// Input: s = "(]"

// Output: false

// Example 4:

// Input: s = "([])"

// Output: true

// Example 5:

// Input: s = "([)]"

// Output: false

package DAY_04_12_25;

import java.util.Stack;

public class Probem2 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        int n = s.length();
        if(n%2!=0) return false;

        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(ch=='(') stack.push(')');
            else if(ch=='{') stack.push('}');
            else if(ch=='[') stack.push(']');
            else if (!stack.isEmpty() && ch== stack.peek() ){
                stack.pop();
            }
            else{
                return false;
            }
        }
        if(stack.isEmpty()) return true;
        else return false;
    }

}
