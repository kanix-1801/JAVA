class arrayDemo{
    public static void main(String[] args) {
    // declare 
    int arr[] = null;
    System.out.println(arr); // null

    // allocate space
    arr = new int[5];
    System.out.println(arr); //[I@76ed5528   [ --> arr, I --> int type 

    // get
    System.out.println(arr[0]); //  0
    System.out.println(arr[1]); //  0
    System.out.println(arr[2]); //  0
    System.out.println(arr[3]); //  0
    System.out.println(arr[4]); //  0

    // set
    arr[0] = 100;
    arr[1] = 10;
    arr[2] = 20;
    arr[3] = 30;
    arr[4] = 40;

    // get
    System.out.println(arr[0]); //  100
    System.out.println(arr[1]); //  10
    System.out.println(arr[2]); //  20
    System.out.println(arr[3]); //  30
    System.out.println(arr[4]); //  40

    // print 
    for(int i = 0; i< arr.length; i++){
        System.out.println(arr[i]);
    }

    //enhanced for loop
    for(int val: arr){
        System.out.println(val);
    }
    
    int i=0,j=3;
    System.out.println(arr[i] +","+arr[j]);
    swap(arr,i, j);
    System.out.println(arr[i] +","+arr[j]);
    
   }
//    public static void swap(int a, int b){
//     int temp = a;
//     a = b;
//     b = temp;
//    }
   public static void swap(int[] arr,int one,int two){
    int temp = arr[one];
    arr[one] = arr[two];
    arr[two] = temp;
}
}