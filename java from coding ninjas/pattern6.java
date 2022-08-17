import java.util.Scanner;

public class pattern6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        int x = 1;
        while(i <= n){
            int j = 1;
            while(j<=i){
                System.out.print(x);
                j++;
                x++;
            }
            System.out.println();
            i++;
        }
    }
}
// input-->
// 4
// output-->
// 1
// 23
// 456
// 78910