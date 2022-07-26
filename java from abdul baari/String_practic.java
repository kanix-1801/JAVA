class String_practic{
    public static void main(String[] args){
        String str = "welcome";
        int l = str.length();
        System.out.println(l);
        String str1 = str.toUpperCase();
        System.out.println(str1);
        String str2 = str.toLowerCase();
        System.out.println(str2);

        String str3 = str.substring(3);
        System.out.println(str3);
        String str4 = str.substring(2,6);
        System.out.println(str4);
        
        String strz = "   xyz   ";
        System.out.println(strz);
        String strx = strz.trim();
        System.out.println(strx);
        
        String str5 = str.replace('e','k');
        System.out.println(str5);

        
    }
}