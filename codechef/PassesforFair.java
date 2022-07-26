import java.util.Scanner;
class PassesforFair{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T -- > 0){
            int N= sc.nextInt();
            int K = sc.nextInt();
        if(N > K){
            System.out.println("YES");
        } else if(N < K){
            System.out.println("NOW");
        }else{
            System.out.println("YES");
        }
        }
    }
}