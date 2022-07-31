import java.util.Scanner;

class Factors{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int j = 2; j<n; j++){
            if(n%j==0){
                System.out.print(j+"");
            }
            else{}
        }   
    }
}