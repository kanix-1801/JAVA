import java.util.Scanner;

class triangleofNumbers{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while(i<=n){
            
            int j = 1;
            while(j<=n-i){   //n-i = 3,2,1
                System.out.print(" ");
                j++;
            }
             j = 1;
             int k = i;
            while(j<=i){ // i=1,2,3,4
                System.out.print(k);
                k++;
                j++;
            }
            k = i;
            j = 1;
            while(j<i){ // j<i --> 2,3,4
                System.out.print(i+k-j-1);
                // k--;
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
// input-->
// 4
// output-->
//    1
//   232
//  34543
// 4567654
