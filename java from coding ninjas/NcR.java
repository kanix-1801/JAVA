import java.util.Scanner;

class NcR{

    public static int factorial(int n){
        int ans = 1;
        for(int i = 1; i<=n; i++){
            ans = ans * i;
        }
        return  ans;
    }

    public static boolean isPrime(int n){
        int d = 2;
        while(d<n){
            if(n % d == 0){
                return false;
            }
            d++;
        }
        return true;
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("for the nCr give me n and than r ");
        int n = sc.nextInt();
        int r = sc.nextInt();


        int num = factorial(n);
        int den1 = factorial(r);
        int den2 = factorial(n-r);

        // System.out.println(isPrime(12));
        /*
        int num = 1;
        for(int i = 1; i<=n; i++){
            num = num * i;
        }
        
        int den1 = 1;
        for(int i = 1; i<=r; i++){
            den1 = den1 * i;
        }

        int den2 = 1;
        for(int i = 1; i<=n-r; i++){
            den2 = den2 * i;
        }
         */
        System.out.println(num/(den1 * den2));
    }    
}