import java.util.Scanner;

public class Operators{
    public static void main(String[] arg){
        int a = 16;
        int b = 16;
        int c = 10;            //Outputs-->  
        System.out.println(a+b); //32
        System.out.println(a-b); //0
        System.out.println(c-b); //-6
        System.out.println(a*b); //256
        System.out.println(a/b); //1
        System.out.println(a%b); //0
        System.out.println(a==b);//true
        System.out.println(c==b);//false
        System.out.println(c>b); //false
        System.out.println(c<b); //true
        System.out.println(c!=b);//true
        System.out.println(a!=b);//false


        int x,y;
        Scanner take_input = new Scanner(System.in);
        System.out.println("enter a number for x :");
        x = take_input.nextInt();
        System.out.println("enter a number for y :");
        y = take_input.nextInt();
        System.out.println("the sum of x and y is : " + (x+y));

    }
}
