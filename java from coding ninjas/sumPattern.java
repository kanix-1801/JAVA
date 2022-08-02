import java.util.Scanner;
class sumPattern{
    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int i = 1;
    while(i<=n){
        int x = 0;
        for(int j = 1; j<=i; j++){
            if(j==1){
            System.out.print(j);
        }else{
            System.out.print("+"+j);
        }
            x = x+j;
        }
        System.out.print("="+x);
        
        System.out.println();

        i++;
    }
}
}
// input-->
// 5
// output-->
// 1=1
// 1+2=3
// 1+2+3=6
// 1+2+3+4=10
// 1+2+3+4+5=15