import java.util.Scanner;

public class Mountes{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("give me a mounth number which you want to know that have many days in there ->");;
        int mounth = sc.nextInt();
        if(mounth <= 12){
            switch(mounth){
                case 2 : 
                System.out.println("in there we have 28 days");
                break;
                case 4 :
                case 6:
                case 9:
                case 11:
                System.out.println("in there we have 30 days");
                break;
                default:
                System.out.println("in there we have 31 days");
                break;    
            }
        }
        else{
            System.out.println("hayyy! we have only 12 mounth");
        }
    }
}