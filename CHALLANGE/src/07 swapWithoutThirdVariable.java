import java.util.Scanner;

class swapWithoutThirdVariable {
     public static void main(String[] args) {
         Scanner input=new Scanner(System.in);
         System.out.println("Welcome to the swapping station without using third variable");
         System.out.println("Please enter a first number");
         int first=input.nextInt();
         System.out.println("Please enter a second number");
         int second=input.nextInt();
         first=first+second;
         second=first-second;
         first=first-second;
         System.out.println("After swapping thje value of first is "+first);
         System.out.println("After swapping the value of second is "+second);
     }
}
