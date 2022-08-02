import java.util.Scanner;
class parallelogramPattern{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while(i<=n){
            for(int j = 1; j<i; j++){
                System.out.print(" ");
            }
            
            for(int j = 1; j<=n; j++){
                System.out.print("*");
            }
            
            System.out.println();

            i++;
        }
    }
}
// input-->
// 5
// output-->
// *****
//  *****
//   *****
//    *****
//     *****