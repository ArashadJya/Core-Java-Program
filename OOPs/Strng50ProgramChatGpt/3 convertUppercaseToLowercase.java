 class convertUppercaseToLowercase {
     public static void main(String[] args) {
         String s="ABCD";
         String result="";
         for (int i=0;i<s.length();++i){
                 char ch=s.charAt(i);

                 if ('A'<=ch && 'Z'>=ch){
                    ch=(char) (ch+32);
                 }
                 result=result+ch;

         }
         System.out.println(result);
     }
}
