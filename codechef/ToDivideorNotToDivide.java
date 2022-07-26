import java.util.Scanner;

class ToDivideorNotToDivide{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T -- >0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
           
            if (a == b  || a %2 ==0 && b%2 == 0 && a>b){
                System.out.println(-1);
            }else{
                while(n <= Math.pow(10, 9)){
                    if(n%a == 0 && n%b != 0){
                            System.out.println(n);
                            break ;
                    }
                    n++;
                }
            }
        }
    }
}