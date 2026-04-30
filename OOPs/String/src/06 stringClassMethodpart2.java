 class part2 {
     public static void main(String[] args) {
         String s1="Arashad";
         String s2="arashad";
         System.out.println(s1.equals(s2));
         System.out.println(s1.equalsIgnoreCase(s2));

         System.out.println("compareto() and compareToIgnorrecase() ");
         String s3="a";
         String s4="A";
         System.out.println(s3.compareTo(s4));
         //agar ham ek string ko empty rakhte hai and compare karate hai to wah second string ki length calculate kar dega
         System.out.println(s3.compareToIgnoreCase(s4));
         //is case me capital and small ka koi effect nhi hota hai
     }
}
