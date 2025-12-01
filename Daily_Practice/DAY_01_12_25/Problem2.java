package DAY_01_12_25;

import java.util.*;

public class Problem2 {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama".toLowerCase();
        int n = s.length();
        String str = "";
        String rev = "";
        boolean ans = false;
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            // if(Character.isLetterOrDigit(ch))
            if(('a'<=ch && 'z'>=ch)||('0'<=ch &&'9'>=ch)){
                str+=ch;
            }
        }
        for(int i=str.length()-1;i>=0;i--){
            rev += str.charAt(i);
        }
        if(str.equals(rev)){
            ans = true;
        }
         
        System.out.println(ans);
    }
}
