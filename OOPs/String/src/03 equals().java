 class demos1 {
     public static void main(String[] args) {
         String s1=new String("jya");
         String s2=new String("jya");
         System.out.println(s1.equals(s2));    //True
         System.out.println(s1==s2);           //False
         //ye heap area ke andar ka object check karta hai agar ham chahate hai ki SCP ke andar ka check kare to ham intern method ka use karenge
         System.out.println(s1.intern()==s2.intern());  //True
     }
 }




