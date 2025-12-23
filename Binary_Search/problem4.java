package Binary_Search;

// peak in the mountain array

public class problem4 {
    public static void main(String[] args) {
        int arr[] = {1,3,4,5,7,8,6};
        int start =0;
        int end = arr.length-1;
        while(start<end){
            int mid = start+ (end -start)/2;
            if(arr[mid]>=arr[mid+1]) 
                end=mid;
            else
                start = mid+1;
        }
        System.out.println(start);

    }
}
