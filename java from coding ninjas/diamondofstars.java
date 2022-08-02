// 

import java.util.Scanner;

class diamondofstars{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;

        int x = 0;
        int y = 0;
            if(n%2==0){
                x = n/2;
                y = n/2;
            }else{
                x = (n/2)+1;
                y = (n/2);
            }
        while(i<=x){
            
            for(int j = 1; j<=x-i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            for(int j = 1; j<i; j++){
                System.out.print("*");
            }
            System.out.println();

            i++;
        }
        i = 1;
        while(i<=y){
            
            for(int j = 1; j<=i; j++){
                System.out.print(" ");
            }
            for(int j = y; j>=i; j--){
                System.out.print("*");
            }
            for(int j = 1; j<=y-i; j++){
                System.out.print("*");
            }
            System.out.println();

            i++;
        }
    }
}
// input-->
// 7
// output-->

//    *
//   ***
//  *****
// *******
//  *****
//   ***
//    *