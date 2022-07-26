import java.util.Scanner;

class Array{
    public static void main(String[] args){
        int[] arra = takeInput();
        display(arra);
    }
    static Scanner sc = new Scanner(System.in);
    public static int[] takeInput() {
        System.out.print("give the size of the array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i<arr.length; i++){
            System.out.print("give me the value of index "+(i)+"'s : ");
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    public static void display(int[] arr){
        for(int i = 0; i<= arr.length; i++){
            System.out.println("the value of index "+i+"'s is : "+arr[i]);
        }
    }
}
