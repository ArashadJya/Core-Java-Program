import java.util.Scanner;

class LargestOfThreeNumber {
     public static void main(String[] args) {
         Scanner input=new Scanner(System.in);
         System.out.println("Welcome to the swapping of three number");
         System.out.println("please enter a first number");
         int a=input.nextInt();
         System.out.println("Please enter a second number");
         int b= input.nextInt();
         System.out.println("Please enter a third number");
         int c=input.nextInt();
         if (a>b & a>c){
             System.out.println("Your greater number is "+a);
         }
         else if (b>c &b>a) {
             System.out.println("Your greater number is "+b);
         }
         else {
             System.out.println("Your greater number is "+c);
         }
     }
}
