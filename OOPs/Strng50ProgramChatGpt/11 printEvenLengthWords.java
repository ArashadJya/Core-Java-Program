 class printEvenLengthWords {
     public static void main(String[] args) {
         String s="my name is arashad khan";
         String[] words=s.split(" ");
         for (int i=0;i<words.length;++i){
             if (words[i].length()%2==0){
                 System.out.print(words[i]+" ");
             }
         }
     }
}
