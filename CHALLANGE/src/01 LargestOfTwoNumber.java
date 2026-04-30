import java.util.Scanner;

class LargestOfTwoNumber {
     public static void main(String[] args) {
         Scanner input=new Scanner(System.in);
         System.out.println("welcome to the swapping of two number");
         System.out.println("Please enter e number");
         int a=input.nextInt();
         System.out.println("Please enter a number");
         int b=input.nextInt();
         if (a>b){
             System.out.println("Your greater number is "+a);
         }
         else{
             System.out.println("Your greater number is "+b);
         }
     }

}
