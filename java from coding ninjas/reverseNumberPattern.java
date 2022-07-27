import java.util.Scanner;

public class reverseNumberPattern{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while(i <= n){
            int j = 1;
            int x = i;
            while(j<=i){
                System.out.print(x);
                x--;
                j++;
            }
            System.out.println();
            i++;
        }
    }
}