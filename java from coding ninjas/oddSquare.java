import java.util.Scanner;
class oddSquare{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int [n];
        int x = 1;
        for(int i = 0; i<n; i++){
            arr [i] = x;
            x = x + 2;
        }
        // arr = {1,3,5,7,...}
        for(int i = 0; i<n; i++){
            int c = i;
            for(int j = 0; j<n; j++){
                if(c<=n-1){
                    System.out.print(arr[c]);
                    c++;
                }else{
                    System.out.print(arr[c-n]);
                    c++;
                }
            }
            
            System.out.println();
        }
    }
}

