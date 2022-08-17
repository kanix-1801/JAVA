import java.util.Scanner;

class pattern14{
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
            while(j<=i){ // i=1,2,3,4
                System.out.print(j);
                j++;
            }
             j = 1;
            while(j<i){ // j<i --> 2,3,4
                System.out.print(i-j);
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
//   121
//  12321
// 1234321