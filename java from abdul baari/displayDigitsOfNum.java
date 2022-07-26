import java.util.Scanner;
import java.math.*;
class displayDigitsOfNum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("give me the number : ");
        int x = sc.nextInt();
        int sum = 0;
        int numOfDigits = 0;
        while(x>0){
            System.out.println(x%10);
            sum = sum + x%10;
            x = x/10;
            numOfDigits = numOfDigits + 1;
        }
        System.out.println("the sum of these digits are : "+sum);
        System.out.println("the num Of Digits are : "+ numOfDigits);
        

        // double a = Math.pow(10,(numOfDigits-1));
        // System.out.println(a);
    }
}