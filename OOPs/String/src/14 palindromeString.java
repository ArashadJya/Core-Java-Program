import java.util.Scanner;

class palindromeString {
     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println("Please enter a string");
         String a=sc.nextLine();
         String temp="";
         int b=a.length();
         for (int i=b-1;i>=0;--i){
             temp=temp+a.charAt(i);
         }
         System.out.println(temp);
         if (a.equals(temp)){
             System.out.println("String is palindrome ");
         }
         else{
             System.out.println("String is not a palindrome");
         }

     }
}
