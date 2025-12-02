package DAY_01_12_25;

public class Problem3 {
    public static void main(String[] args) {
        int arr[] = {1,3,4,5};
        int smallest = Integer.MAX_VALUE;
        int secondSmall =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<smallest){
                secondSmall = smallest;
                smallest = arr[i];
            }
            if(arr[i]>smallest && arr[i]<secondSmall){
                secondSmall = arr[i];
            }
        }
        System.out.println(secondSmall);
    }
}
