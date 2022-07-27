//interestingAlphabets

import java.util.Scanner;

public class interestingAlphabets{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        int v = n;
        while(i <= n){
            int j = 1;
            char x = (char)('A'+v-1);
            while(j<=i){
                System.out.print(x);
                j++;
                x++;
            }
            System.out.println();
            i++;
            v--;
        }
    }
}