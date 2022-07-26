import java.util.Scanner;

import javax.sql.rowset.spi.SyncResolver;

class menuDrivenProgramCalculation{
    public static void main(String[] args) {
        System.out.println("Menu");
        System.out.println("ADD");
        System.out.println("SUB");
        System.out.println("MUL");
        System.out.println("DIV");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number : ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter option in word : ");
        String str = sc.nextLine();

        switch(str){
            case "ADD" : System.out.println(x+y);
            break;
            case "SUB" : System.out.println(x-y);
            break;
            case "MUL" : System.out.println(x*y);
            break;
            case "DIV" : System.out.println(x/y);
            break;
        }
    }
}