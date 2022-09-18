public class std_challenge1{
    public static void main(String[] args){
        int b[] = {3,9,7,8,12,6,15,5,4,10};
        // System.out.println(b.length);

        // 1.Finding sum of element
        int sum = 0;

        // by for-each loop
        // for(int x:b){
        //     sum = sum+x;
        // }

        // 2.Finding maximum element
        int max = -1000;
        for(int i = 0; i<b.length; i++){
            sum = sum + b[i];
            if (max < b[i]){
                max = b[i];
            }
        }
        System.out.println("the sum is "+sum);
        System.out.println("the max is "+max);

        //4.finding second largest element

        int max1 = 0 , max2 = 0;
        for(int i = 0; i<b.length; i++){
            if(b[i] > max1){
                max2 = max1;
                max1 = b[i];
            }else{}
        }
        System.out.println("the second lagrest element is "+max2);
        
        // 3.searching an element
        int find = 4;
        for(int i= 0; i<b.length; i++){
            if(find == b[i]){
                System.out.println("founded on index "+i);
                return;
            }
        }
        System.out.println("not founded");



    }
}