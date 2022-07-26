import java.util.Scanner;

class percentageGrade{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("give me your hindi english maths marks out of 100 : ");
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();
        float total = m1+m2+m3;
        float percentage = (total*100)/300;

        if(percentage>=70 && percentage<=100){
            System.out.println("A");
        }else if(percentage>=60 && percentage<70){
            System.out.println("B");
        }else if(percentage>=50 && percentage<60){
            System.out.println("C");
        }else if(percentage>=40 && percentage<50){
            System.out.println("D");
        }else{
            System.out.println("F");
        }
    }
}