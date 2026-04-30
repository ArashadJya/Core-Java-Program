import java.util.Arrays;

class programAngraam {
     public static void main(String[] args) {
         String s1="listen";
         String s2="netsl";

         char[] ch1=s1.toCharArray();
         char[] ch2=s2.toCharArray();

         Arrays.sort(ch1);
         Arrays.sort(ch2);

         if (Arrays.equals(ch1,ch2)){
             System.out.println("String is Angram");
         }
         else{
             System.out.println("String is not angram");
         }
     }
}
