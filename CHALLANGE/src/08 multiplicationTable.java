import java.util.Scanner;

class multiplicationTable {
     public static void main(String[] args) {
         Scanner input=new Scanner(System.in);
         System.out.println("Welcome to the multiplication table");
         System.out.println("please enter a number who want to print the table ");
         int num=input.nextInt();
         for (int i=1;i<=10;++i){
             System.out.println(num+" x "+i+" = "+(num*i));
         }
     }
}
