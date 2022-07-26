import java.util.Scanner;
class findingSumOfArr{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int [] array = input();
        // take input this number which you want to find
        int n = sc.nextInt();
    }
    // for find a num
    public static void Find(int[] arr, int num){

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