 class countVowelAndConsonents {
     public static void main(String[] args) {
         String s="HEllo World 123";
         s=s.toLowerCase();

         int vowel=0;
         int consonent=0;
         for (int i=0;i<s.length();++i){
             Character ch=s.charAt(i);
             if (ch=='a' || ch=='e' || ch=='i' || ch=='o' ||ch=='u'){
                 ++vowel;
             }
             else {
                 if(Character.isAlphabetic(ch)){
                     ++consonent;
                 }
             }

         }
         System.out.println("vowel "+vowel);
         System.out.println("consonent "+consonent);
     }
}
