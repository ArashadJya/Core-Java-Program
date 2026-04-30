 class countFrequencyOfCharacter {
     public static void main(String[] args) {
         String s="aabbbcc";

         for (int i=0;i<s.length();++i){
             int count=0;
             for (int j=0;j<s.length();++j){
                 if (s.charAt(i)==s.charAt(j)){
                     ++count;
                 }
             }
             if (s.indexOf(s.charAt(i))==i){
                 System.out.println(s.charAt(i)+"="+count);
             }
         }

     }
}
