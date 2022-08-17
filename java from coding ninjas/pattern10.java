import java.util.Scanner;

public class pattern10{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while(i <= n){
            int j = 1;
            int x = i;
            while(j<=n){
                System.out.print((char) ('A'+x-1));
                j++;
                x++;
            }
            System.out.println();
            i++;
        }
    }
}
// input-->
// 4
// output-->
// ABCD
// BCDE
// CDEF
// DEFG