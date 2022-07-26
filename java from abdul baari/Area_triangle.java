import java.lang.*;
import java.util.Scanner;

class Area_triangle{
    public static void main(String[] args) {
        int a,b,c;
        float s;
        double area;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 sides of a Triangle");

        System.out.println("give the value of a ");
        a = sc.nextInt();
        System.out.println("give the value of b ");
        b = sc.nextInt();
        System.out.println("give the value of c");
        c = sc.nextInt();
        s = (a+b+c)/2f;
        area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("the area of triangle is "+area);

    }
}