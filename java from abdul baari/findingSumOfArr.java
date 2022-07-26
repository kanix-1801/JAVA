import java.nio.charset.MalformedInputException;
import java.util.Scanner;

class findingSumOfArr{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int [] array = input();
        System.out.println("the sum of the array is : "+Sum(array));
    }

    // for sum of all element of array
    public static int Sum(int[] arr){
        int sum = 0;
        for(int i = 0; i<arr.length; i++){
            sum = sum + arr[i];
        }
        return sum;
    }
    // for input the array
    public static int[] input(){
        System.out.println("give me the size of array");
        int size = sc.nextInt();
        System.out.println("now give me the value of array");
        int [] arr = new int[size];
        for (int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }
}