import java.util.Scanner;

class multiplicationTable{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        if(0<= n && n <=10000){
        for(int i = 1; i<=10; i++){
            System.out.println(n*i);
        }
    }
    }
}