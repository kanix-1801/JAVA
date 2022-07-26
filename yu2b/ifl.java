import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class ifl {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        if(N%2==0){
            if(2<=AND<=5) {
                System.out.println("Not Weird");
           }else if(6<=AND<=20){
               System.out.println("Weird");
           }else{
               System.out.println("Not Weird");
           }
        }else{
            System.out.println("Weird");
        }
    }
}
