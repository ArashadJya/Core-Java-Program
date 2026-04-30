import java.util.Scanner;

class EvenOdd {
     public static void main(String[] args) {
         Scanner input=new Scanner(System.in);
         System.out.println("Welcome to the checking even/odd number");
         System.out.println("please enter a number");
         int num=input.nextInt();
         if(num%2==0){
             System.out.println("Number "+num+" is Even ");
         }
         else{
             System.out.println("This number is Odd ");
         }
     }
}
