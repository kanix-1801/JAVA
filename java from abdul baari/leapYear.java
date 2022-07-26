import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

class leapYear{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if(year%100 == 0){
            if(year%400 == 0){
                System.out.println("leap year");
            }else{
                System.out.println("not a leap year");
            }
        }else if(year%4==0){
            System.out.println("leap year");
        }else{
            System.out.println("not a leap year");
        }
    }
}

////////////////// another ways to doing this ///////////////////
     
            // if(year % 4 != 0 || year % 100 == 0 && year % 400 != 0){
            //     console.log("Not Leap");
            // }else{
            //     console.log("Leap!")
            // }


        //  if(year%4 == 0){
        //      if(year%100 ==0){
        //         if(year%400 == 0){
        //             console.log("Leap year.");
        //         }else{
        //             console.log("Not Leap.");
        //         }
        //      }else{
        //          console.log("Leap year.");
        //      }
        //  }else{
        //      console.log("Not Leap.");
        //  }


    //   if(year%100 == 0){
    //             if(year%400 == 0){
    //               console.log("Leap");
    //             }else{
    //                 console.log("Not Leap");
    //             }
    //         }else if(year%4 == 0){
    //             console.log("Leap!");
    //         }else{
    //             console.log("Not Leap");
    //         }
     
    
