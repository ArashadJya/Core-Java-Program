 class checkPalindromeString {
     public static void main(String[] args) {
         String word="abababa";
         String var="";
         int length=word.length();
         for (int i=length-1;i>=0;--i){
             var=var+word.charAt(i);
         }
         if (word.equals(var)){
             System.out.println("This is palindrome");
         }
         else{
             System.out.println("This is not palindrome");
         }
     }
}
