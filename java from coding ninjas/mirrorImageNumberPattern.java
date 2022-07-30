import java.util.Scanner;

public class mirrorImageNumberPattern{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while(i <= n){
            int j = 1;
            int x = n-i;
            while(x>=1){
                System.out.print(" ");
                x--;
            }
            while(j<=i){
                System.out.print(j);
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
// input-->
// 4
// output-->
//    1
//   12
//  123
// 1234