import java.util.Scanner;

class Clculator {
     public static void main(String[] args) {
         Scanner input=new Scanner(System.in);
         System.out.println("Welcome to the mini claculator");
         System.out.println("please enter a first number");
         int a=input.nextInt();
         System.out.println("Please enter a second number");
         int b=input.nextInt();
         System.out.println("select a operater +,-,*,/");
         String  symbol=input.next();
         switch (symbol){
             case "+":
                 System.out.println("Your result is "+(a+b));
                 break;
             case "-":
                 System.out.println("Your result is " + (a-b));
                 break;
             case "*":
                 System.out.println("Your result is "+(a*b));
                 break;
             case "/":
                 System.out.println("Your result is "+(a/b));
                 break;
             default:
                 System.out.println("Your symbol is invalid");

         }


     }
}
