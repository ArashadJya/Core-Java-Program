import java.util.Scanner;

class palindrome {
     public static void main(String[] args) {
         System.out.println("Please enter a word");
         Scanner sc=new Scanner(System.in);
         String name=sc.nextLine();
         int length=name.length();
         String var="";
         for (int i=length-1;i>=0;--i){
             var=var+name.charAt(i);
         }
         if (name.equals(var)){
             System.out.println("This string is palindrome");
         }
         else{
             System.out.println("This string is not palindrome");
         }
     }
}
