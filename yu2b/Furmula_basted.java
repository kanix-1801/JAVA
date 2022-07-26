import java.util.Scanner;
// classes and objects
class Furmula{
    public int a,b;
    public void print(int a){
        System.out.println(a);
    }
    public void SUM(int a, int b){
        System.out.println(a+b);
    }
    public void abr(int a, int b){
        System.out.println((a+b)/2);
    }
    public void abr(int a, int b,int c){
        System.out.println((a+b+c)/3);
    }
    public void even_odd(int a){
        int z = a%2;
        if(z==0){
            System.out.println(a +" is even");
        }
        else{
            System.out.println(a +" is odd");
        }
      
    }
    
}

public class Furmula_basted{
    public static void main(String[] arg){
        Furmula obj = new Furmula();
        obj.print(12);
        obj.SUM(12,16); 
        // function overloding
        obj.abr(12,13);
        obj.abr(12,13,14);
        
        obj.even_odd(12);
        obj.even_odd(113);
    }
}