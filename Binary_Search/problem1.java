// First Occurrence of target

package Binary_Search;

public class problem1 {
    public static void main(String[] args) {
        int arr[] = {1,2,2,2,5,5,6,7,7,8};
        int start = 0;
        int end = arr.length-1;
        int target =  2;
        int idx=-1;
        while(start<=end){
            int mid = start + (end -start)/2;
            if(arr[mid]==target){
                idx= mid;
                end = mid-1;
            }else if (arr[mid]>target){
                 end = mid-1;
            }else{
                start = mid+1;
            }
        }
        System.out.println(idx);
    }
}
