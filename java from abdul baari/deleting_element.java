import java.util.Scanner;

public class deleting_element{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[10];
        arr[0] = 3;
        arr[1] = 9;
        arr[2] = 7;
        arr[3] = 8;
        arr[4] = 12;
        arr[5] = 15;

        System.out.println("array before the insert the value -->");
        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i] + ",");
        }
        System.out.println();

        // int index_c = 5;
        int index;
        System.out.println("give me the index which you  want delete");
        index = sc.nextInt();

        int temp = 0;

        for(int i = index; i<(arr.length-1); i++){
            arr[i] = arr[i+1]; 
        }
        
        
        System.out.println("now your array -->");
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + ",");
        }
        
    }
}