// WAP to remove character from the first string which are present in second string

class program9 {
     public static void main(String[] args) {
         String s1="arashad";
         String s2="jyah";

         String result="";
         for (int i=0;i<s1.length();++i){
             int count=0;
             for (int j=0;j<s2.length();++j){
                 if (s1.charAt(i)==s2.charAt(j)){
                     ++count;
                 }
             }
             if (count==0){
                 result=result+s1.charAt(i);
             }
         }
         System.out.println(result);
     }
}
