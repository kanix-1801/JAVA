import java.util.Scanner;

public class characterPattern{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        char c = 0;
        while(i <= n){
            char x = 'A';
            x = (char) (x + c);
            int j = 1;
            while(j<=i){
                System.out.print(x);
                j++;
                x++;
            }
            System.out.println();
            i++;
            c++;
        }
    }
}