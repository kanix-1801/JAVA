import java.util.Scanner;

public class positive_or_not{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();

        if(i > 0){
            System.out.println("positive");
        }else if(i == 0){
            System.out.println("it's not positive nor a negative it's zero");
        }else{
            System.out.println("Negative");
        }

    }
}