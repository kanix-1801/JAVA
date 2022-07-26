import java.util.Scanner;

public class Conditional{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number for x :");
        int x = sc.nextInt();
        System.out.println("Enter a number for y :");
        int y = sc.nextInt();
        System.out.println("Enter a number for z :");
        int z = sc.nextInt();
        // we are chacking which one is max
        if(x>y){
            if(x>z){
                System.out.println(x +" (x) is max");
            }
            else{
                System.out.println(z +" (z) is max");
            }
        }
        else{
            if(y>z){
                System.out.println(y +" (y) is max");
            }
            else{
                System.out.println(z +" (z) is max");
            }
        }
    }
}