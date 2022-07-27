import java.util.Scanner;

public class alphaPattern{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        char x = 'A';
        while(i <= n){
            int j = 1;
            while(j<=i){
                System.out.print(x);
                j++;
            }
            x++;
            System.out.println();
            i++;
        }
    }
}