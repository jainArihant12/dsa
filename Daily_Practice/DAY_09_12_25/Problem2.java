package DAY_09_12_25;

public class Problem2 {
    public String reverseVowels(String s) {
        int left =0;
        int right = s.length()-1;
        char ch[] = s.toCharArray();
        while(left<right){
            while(left < right && !(ch[left]=='a'||ch[left]=='A'||ch[left]=='e'||ch[left]=='E'||ch[left]=='i'||ch[left]=='I'||ch[left]=='o'||ch[left]=='O'||ch[left]=='u'||ch[left]=='U')){
                left++;
            }
            while(left < right && !(ch[right]=='a'||ch[right]=='A'||ch[right]=='e'||ch[right]=='E'||ch[right]=='i'||ch[right]=='I'||ch[right]=='o'||ch[right]=='O'||ch[right]=='u'||ch[right]=='U')){
                right--;
            }
            char temp =ch[left];
            ch[left] = ch[right];
            ch[right] = temp;
             left++;
             right--;

        }
        return new String(ch);
    }
}
