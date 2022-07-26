class recurtion{
    public int multipli(int a , int b){
        if(b==0){
            return 0;
        }
        int smalloutput = a + multipli(a,b-1);
        return smalloutput;
    }
    public int s(int y,int x){
        if(x==0){
            return 0;
        }else{
            if(x%10==0){
                return 1;
            }else{
                return 0;
            }
        }
        int smalloutput = s (y,x/10);
        return smalloutput;
    }
}

public class multiplecationbyrecurtion{
    public static void main(String[] arg){
        System.out.println("hee");
        recurtion obj = new recurtion();
        int mult = obj.multipli(3, 4);
        // int summ = obj.sum(3);
        int x = obj.s(5,10330);

        System.out.println(x);
        System.out.println(123/10);
        // System.out.println(summ);
    }
}