import java.net.SocketPermission;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import javax.swing.plaf.synth.SynthScrollPaneUI;

class radix_of_a_num{
    public static void main(String[] args) {
        // int num;
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();

        if(num.matches("[01]+")){
            System.out.println("binary redix is 2");
        }else if(num.matches("[0-7]+")){
            System.out.println("octal redix is 8");
        }else if(num.matches("[0-9]+")){
            System.out.println("decimal redix is 10");
        }else if(num.matches("[0-9A-F]+")){
            System.out.println("hexadecimal redix is 16");
        }else{
            System.out.println("invalid number");
        }
    }
}