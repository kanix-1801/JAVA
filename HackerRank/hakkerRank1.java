import java.util.Scanner;

class hakkerRank1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        while(q-->0){
         int a = sc.nextInt();
         int b = sc.nextInt();
         int cons = 1;
         int n = sc.nextInt();
         int i = 1;
         int sum = 0;
          while(i <= n){
            sum = sum + b*cons;
            cons = cons * 2;
            i++;
            System.out.print((sum + a) + " ");
          }
       }
   }
}