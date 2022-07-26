import org.xml.sax.SAXException;

import java.util.*;

class in_2_num_big_num{
    public static void main(String[] args){
    

    int a,b;

    Scanner sc = new Scanner(System.in);

    a = sc.nextInt();
    b = sc.nextInt();
    
    if(a==b){
        System.out.println( a +" and " +b +" is equle");
    } else if(a>b){ 
        System.out.println(a+" is bigger then "+b);
    } else {
        System.out.println(b+" is bigger then "+a);
    }
    }
}