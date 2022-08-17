import java.util.Scanner;

public class pattern7{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while(i <= n){
            int x = i;
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
//output-->
// 1
// 23
// 345
// 4567