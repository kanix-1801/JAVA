public class array{
    public static void main(String[] args){
        int a[] = new int[5];
        a[2] = 5;
        int b[] = {1,2,3,4};
        System.out.println(b.length);
        // for(int i = 0; i<=a.length; i++){
        // System.out.println(a[i]);}

        for(int x:b){
            System.out.println(x);
        }
        System.out.println();
        for(int x:a){
            System.out.println(x);
        }

    }
}