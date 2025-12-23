package Binary_Search;

// Square root of array

public class problem5 {
    public static void main(String[] args) {
        int x=64;
        int start =0;
        int end = 25;
        int ans=-1;
        while(start<=end){
            int mid = start + (end -start)/2;
            if(mid*mid == x) {
                ans=mid;
                break;
            }
            else if(mid*mid>x){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        System.out.println(ans);
    }
}
