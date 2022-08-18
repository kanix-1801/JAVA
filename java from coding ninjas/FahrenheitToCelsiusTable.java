import java.util.Scanner;

class FahrenheitToCelsiusTable{

    public static void printFahrenheitTable(int start, int end, int step){
        // C = 5/9 x (F-32)
        int i = start;
        while(i <= end){
            // System.out.println(i);
            int c = ((i-32)*5)/9;
            System.out.print(i);
            System.out.print(" "+c);

            i = i + step;
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        int E = sc.nextInt();
        int W = sc.nextInt();
        printFahrenheitTable(S,E,W);
    }
}