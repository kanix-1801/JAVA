import java.lang.*;
import java.util.Scanner;

class Root_of_quadratic_equation{
    public static void main(String[] args){
        int a,b,c;
        double r1,r2;
        Scanner sc = new Scanner(System.in);

        System.out.println("give me value of a,b,c of ax^2 + bx +c ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        r1 = ((-b) + (Math.sqrt(b*b-(4*a*c))))/(2*a);
        r2 = ((-b) - (Math.sqrt(b*b-(4*a*c))))/(2*a);

        System.out.println("root are "+r1+" "+r2);
    }
}