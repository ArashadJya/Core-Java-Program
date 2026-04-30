 class printOddLengthWords {
     public static void main(String[] args) {
         String s="my name is arashad jya";
         String[] words=s.split(" ");
         for (int i=0;i<words.length;++i){
             if (words[i].length()%2==1){
                 System.out.print(words[i]+" ");
             }
         }
     }
}
