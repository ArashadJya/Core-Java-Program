 class stringDemo {
     public static void main(String[] args) {
         String s1="Arashad";  //1object
         String s2=new String("jya"); //2object
         System.out.println(s2.length());  //calculate length of s2 object
         String s3=new String();  //no argument constructer
         System.out.println(s3.length());   //calculate length of s3 object

         System.out.println("//string buffer");
         StringBuffer sb=new StringBuffer("khan");
         sb.append('g');
         System.out.println(sb);
         String s4=new String(sb);
         System.out.println(s4);

         System.out.println("//String builder");
         StringBuilder SB=new StringBuilder("mahason");
         SB.append('d');
         System.out.println(SB);
         String S=new String(SB);
         System.out.println(S);

         System.out.println("byte array");
         byte [] b={101,102,103};
         String s5=new String(b);
         System.out.println(s5);

         //why char array is prefered over string for storing passwords
         char[] c1=new char[]{'a','b','c'};  //chararray print the object
         String s=new String("abc");  //String print the value of object
         System.out.println("c1  "+c1);
         System.out.println("s: "+s);
     }
}
