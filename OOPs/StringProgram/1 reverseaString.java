 class reverseaString {
     public static void main(String[] args) {
         String word="Arashad";
         String var="";
         int length=word.length();
         for (int i=length-1;i>=0;--i){
             var=var+word.charAt(i);
         }
         System.out.println("Reverse String is "+var);
     }
}
