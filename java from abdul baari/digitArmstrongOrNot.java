import java.util.Scanner;
class digitArmstrongOrNot{
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("give me the number : ");
            int x = sc.nextInt();
            // we need to store x's value in a new variable because after the while loop our x's value can convert in to the 0
            int f = x;
            double sum = 0;
            while(x>0){
                sum = sum + Math.pow(x%10, 3);
                x = x/10;
            }
            // math.pow() method are only support double numbers so we have to convert it in to the integer number
            int y = (int)sum;
            // Armstrong number is a number that is equal to the sum of cubes of its digits. 
            if(f == y){
                System.out.println("it's a armstrong number");
            }else{
                System.out.println("it's not a armstrong number");
            }
    }
}