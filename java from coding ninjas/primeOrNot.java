import java.util.Scanner;

public class primeOrNot{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int i = 2;
        while(i < n){
            if(n%i == 0){
                System.out.println("it's not a prime number");
                return;
            }
            i++;
        }
        System.out.println("it's a prime number");
    }
}