import java.util.Scanner;

class maxVlueArr{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int [] array = input();
        display(array);
        // System.out.println("the maximum value of this array : "+Max(array));
        // System.out.println("the minimum value of this array : "+Min(array));
    }
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
    // for each loop
    public static void display(int[] arr){
        System.out.println("so here is your array elements :");
        for(int x:arr){
            System.out.println(x);
        }
    }
    public static int Max(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++){
            if(max<arr[i]){
                max = arr[i];
            }else{;}
        }
        return max;
    }
    public static int Min(int[] arr){
        int min = Integer.MAX_VALUE;
        for(int i = 0; i<arr.length; i++){
            if(min>arr[i]){
                min = arr[i];
            }else{;}
        }
        return min;
    }
}




// class maxVlueArr{
//     public static void main(String[] args) {
        
//         int [] array = {12,15,1,2};
//         int max = Integer.MIN_VALUE;
//         for(int i =0; i<array.length; i++){
//             if(max<array[i]){
//                 max = array[i];
//             }else{;}
//         }
//         System.out.println(max);
//         // int max = -123412;
//         // Max(arr);
        
//     }
// }
//     // public static void Max(int[] array){
//     //     int max = Integer.MAX_VALUE;
//     //     for(int i =0; i<array.length; i++){
//     //         if(max<array[i]){
//     //             max = array[i];
//     //         }else{;}
//     //     }
//     //     System.err.println(max);
//     // } 

