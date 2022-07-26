  import java.lang.*;
import java.util.Scanner;
class Cubiod{
    public static void main(String[] args){
        float breadth,length,height;
        float front,back, right,left, bottom,top;
        Scanner sc = new Scanner(System.in);
        System.out.println("give the Cubiod's lenght,height and bredth");
        System.out.println("give me length ");
        length = sc.nextFloat();
        System.out.println("give me breadth ");
        breadth = sc.nextFloat();
        System.out.println("give me height ");
        height = sc.nextFloat();

        front = length * height;
        back = length * height;

        right = height * breadth;
        left = height * breadth;

        bottom = breadth * length;
        top = breadth * length;

        float total_area = front+back+right+left+bottom+top; 

        System.out.println("the total area of cubiod is "+ total_area);
        
        float volume = length * height * breadth; 
        System.out.println("the total volume of cubiod is "+ volume);

    }
}