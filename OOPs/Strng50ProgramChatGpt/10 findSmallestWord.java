 class findSmallestWord {
     public static void main(String[] args) {
         String s="my name is a Arashad jya";
         String[] words=s.split(" ");
         String min=words[0];
         for (int i=0;i<words.length;++i){
             if (min.length()>words[i].length()){
                 min=words[i];
             }
         }
         System.out.println(min);
     }
}
