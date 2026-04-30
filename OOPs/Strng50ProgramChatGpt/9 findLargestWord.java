 class findLargestWord {
     public static void main(String[] args) {
         String s="my name is arashad jya khans";
         String words[]=s.split(" ");
         String max=words[0];
         for (int i=1;i<words.length;++i){
             if (words[i].length()>max.length()){
                 max=words[i];
             }
         }
         System.out.println(max);
     }
}
