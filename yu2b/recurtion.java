import java.util.Scanner;

class recur{
    // multiplication by using recurtion
    public int multi(int a,int b){
        if(b==0){
            return 0;
        }
        int smalloutput = a + multi(a,b-1);
        return smalloutput;
    }
    // count number by using recurtion
    public int count(int n){
        if(n%10==0){
            return 0;
        }
        int smalloutput = 1 + count(n/10);
        return smalloutput;
    }
    // factorial by using recurtion
    public int factorial(int n){
        if(n==1 || n==0){
            return 1;
        }
        int smalloutput = n * factorial(n-1);
        return smalloutput;
    }
    // power_of using recurtion
    public int power(int a, int b){
        if(b==0){
            return 1;
        }
        int smalloutput = a * power(a,b-1);
        return smalloutput;
    }
    //print_num using recurtion
    public void print_num(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
    print_num(n-1);
    System.out.println(n);
    }
    // //print_num using recurtion
    // public void print_num_in_revers(int n){
    //     if(n==1){
    //         System.out.println(1);
    //         return;
    //     }
    //     print_num(n-1);
    //     System.out.println(n);
    // }
}

public class recurtion{
    static int sum(int n , int m){
        return n+m;
    }
    public static void main(String[] args) {
        System.out.println("hello");
        recur obj = new recur(); 
        int mul = obj.multi(2,4);
        int count = obj.count(2412344);
        System.out.println(mul);
        System.out.println(count);
        int  fact = obj.factorial(4);
        System.out.println(fact);
        System.out.println(count);
        obj.print_num(4);
        // obj.print_num_in_revers(5);
        int  power_of = obj.power(2,4);
        System.out.println(power_of);
        
        
        System.out.println(sum(9,9));

    }
}