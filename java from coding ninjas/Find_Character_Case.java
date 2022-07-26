import java.util.Scanner;

class Find_Character_Case{
    public static void main(String[] args){
        byte b;
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        b = (byte)c;
        if(b>=65 && b<=90){
            System.out.println("1");
        }else if(b>=97 && b<=122){
            System.out.println("0");
        }else{
            System.out.println("-1");
        }
        // switch(b) {
        //     case (b>=66 & b<=90): 
        //     System.out.println("1");
        //     // break;
        //     case (b>=97 & b<=122): 
        //     System.out.println("0");
        //     // break;
        //     default : 
        //     System.out.println("-1");
        // }
    }
}