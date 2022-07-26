class create_String{

  public static void main(String[] args) {
    String str1 = "java program";

    String str2 = new String("java pro");

    System.out.println(str1);
    System.out.println(str2);

    char c[] = {'A','B','C','D'};
    String str3 = new String(c);
    String strx = new String(c,2,2);
    System.out.println(str3);
    System.out.println(strx);
    
    byte b[] = {33,73,22,36,68,67};
    String str4 = new String(b);
    String str4r= new String(b,1,2);
    System.out.println(str4);
    System.out.println(str4r);
}
}
