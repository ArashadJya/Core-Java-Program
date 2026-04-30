import java.util.HashSet;

class uncommonCharacterInTwoString {
     public static void main(String[] args) {
         String s1="abcfg";
         String s2="abcdef";

        HashSet<Character> hs1=new HashSet<>();
        HashSet<Character> hs2=new HashSet<>();

         //store character in hs1
         for (int i=0;i<s1.length();++i){
             hs1.add(s1.charAt(i));
         }

         //store character in hs2
         for (int i=0;i<s2.length();++i){
             hs2.add(s2.charAt(i));
         }

         System.out.println("Uncommon characters");

         for (char ch:hs1){
             if (!hs2.contains(ch)){
                 System.out.print(ch+" ");
             }
         }
         for (char ch:hs2){
             if (!hs1.contains(ch)){
                 System.out.print(ch+" ");
             }
         }

     }
}
