package DAY_01_12_25;

import java.util.*;

class Problem1 {
    public static void main(String[] args) {
        int arr[] = {5, 3, 2};
        int i=0,j=0;
        int n = arr.length;
        int ans[] = new int[n];
        int p =1;
        while(j<n){

            if(i!=j){
                p*=arr[i];
            }
            if(i==n-1){
                ans[j]=p;
                p=1;
                i=-1;
                j++;
            }
            i++;
        }
        System.out.println(Arrays.toString(ans));
    }
    
}