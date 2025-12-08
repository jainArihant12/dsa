


// *********
//  *******
//   *****
//    ***
//     *
//    ***
//   *****
//  *******
// *********


package DAY_08_12_25;
import java.util.Scanner;
class Problem1{
    public static void main(String[] args) {
        System.out.println("Enter number:");
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=n;j>n-i;j--){
                System.out.print(' ');
            }
            for(int j=i*2+1;j<2*n;j++){
                System.out.print('*');
            }
            System.out.println("");
        }
        for(int i=n-1;i>0;i--){
            for(int j=i;j>1;j--){
                System.out.print(' ');
            }
            for(int j=i*2-1;j<2*n;j++){
                System.out.print('*');
            }
            System.out.println("");
        }
    }
}