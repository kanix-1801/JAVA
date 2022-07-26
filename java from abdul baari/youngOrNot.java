import java.util.Scanner;

class youngOrNot{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if(age>=14 && age<=50){
            System.out.println("you are young");
        }else{
            System.out.println("not young");
        }
    }
}