import java.util.Scanner;

class reverseString {
     public static void main(String[] args) {
         Scanner input=new Scanner(System.in);
         System.out.println("Welcome to the calculating reverse string");
         System.out.println("please enter a any word");
         String name=input.nextLine();
         int length=name.length();
         String rev=" ";
         for (int i=length-1;i>=0;--i){
             rev=rev+name.charAt(i);
         }
         System.out.println("Your reverse word is "+rev);
     }
}
