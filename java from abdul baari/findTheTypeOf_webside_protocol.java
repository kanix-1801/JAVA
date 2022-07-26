import java.time.Month;
import java.util.*;

class findTheTypeOf_webside_protocol{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String domain = sc.nextLine();
        String ext = domain.substring(domain.lastIndexOf(".")+1);

        switch(ext){
            case "com" :  System.out.println("commercial");
            break;
            case "org" :  System.out.println("organisation");
            break;
            case "gov" :  System.out.println("Government");
            break;
            case "net" :  System.out.println("Network");
            break;
            default : System.out.println("give a valid input");
        }


        
    }
}