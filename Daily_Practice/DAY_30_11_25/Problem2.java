// question 2 :Create a function with two arguments that will return an array of the first n multiples of x.

// Assume both the given number and the number of times to count will be positive numbers greater than 0.

// Return the results as an array or list 

// Examples
// x = 1, n = 10 --> [1,2,3,4,5,6,7,8,9,10]
// x = 2, n = 5  --> [2,4,6,8,10]                                                                                                                                                                                                                                       x = 3, n = 5 -- > [3, 6, 9, 12, 15]
// x = 50,n = 5 -- >[50, 100, 150, 200, 250]




package DAY_30_11_25;

public class Problem2 {
    public static void main(String[] args) {
        int x = 1 ;
        int n = 10;
        int arr[] = new int[n];
        for(int i=1;i<=n;i++){
            arr[i-1] = x*i;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
