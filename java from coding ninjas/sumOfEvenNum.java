import java.util.Scanner;

class sumOfEvenNum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        //USING FOR LOOP
        int sum = 0;
        for(int i = 0; i<=N; i++){
            if(i%2==0){
                sum = sum + i;
            }
        }
        System.out.println(sum);
        // USING WHILE LOOP
        // int n = 0,temp =0;
        // while(n<N){
        //     if(n%2==0){
        //         temp = temp + n;
        //     }
        //     n++;
        // }
        // System.out.println(temp);
    }
}