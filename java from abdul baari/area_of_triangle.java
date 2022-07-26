import java.lang.*;
import java.util.Scanner;

class area_of_triangle{
    public static void main(String[] arg){
        
        float base,height,area;
        Scanner sc = new Scanner(System.in);

        System.out.println("give base of triangle ");
        base = sc.nextFloat();
        System.out.println("give base of triangle ");
        height = sc.nextFloat();

        area = (base*height)/2;
        // area = (base*height)*0.5f;
        // area = 1f/2f*base*height;


        System.out.println("Area of triangle is "+ area);
    }
}