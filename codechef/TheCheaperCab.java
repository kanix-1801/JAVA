import java.util.Scanner;

class TheCheaperCab{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T -- > 0){
            int x= sc.nextInt();
            int y = sc.nextInt();
        if(x < y){
            System.out.println("FIRST");
        } else if(x > y){
            System.out.println("SECOND");
        }else{
            System.out.println("ANY");
        }
    }
    }
}