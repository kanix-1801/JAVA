import java.util.Scanner;

public class pattern4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while(i <= n){
            // int x = n;
            int j = 1;
            while(j<=n){
                System.out.print(n-j+1);
                // System.out.print(x);
                j++;
                // x--;
            }
            System.out.println();
            i++;
        }
    }
}
// input-->
// 4
// output-->
// 4321
// 4321
// 4321
// 4321