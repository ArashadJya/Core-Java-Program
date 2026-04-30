import java.util.HashSet;

class RemoveDuplicateWords1 {
     public static void main(String[] args) {
         String s="I am a arashad jya and I am a student ";
         String[] words=s.split(" ");

         HashSet<String> hs=new HashSet<>();
         for (int i=0;i<words.length;++i){
             hs.add(words[i]);
         }

         System.out.println(hs);
     }

}
