package DAY_10_12_2025;

public class Problem1 {
    public static void main(String[] args) {
        int n =11;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j || n-j-1 == i || i==0 || i==n-1)
                    System.out.print("*");
                else{
                     System.out.print(" ");
                }   
            }
            System.out.println();
        }
    }
}
