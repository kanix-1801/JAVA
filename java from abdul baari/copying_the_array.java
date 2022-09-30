import java.util.Scanner;

public class copying_the_array{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int arr[] = {12,3,1,12,33,45,2134,231,13};
        int arr1[] = new int [arr.length];

        System.out.println("array before the copy the value -->");
        for(int i =0; i<arr.length; i++){
            arr1[i] = arr[i];
            System.out.print(arr[i] + ",");
        }
        System.out.println();

        System.out.println("the copyied array -->");
        for(int i = 0; i<arr1.length; i++){
            System.out.print(arr1[i] + ",");
        }
        
    }
}