import java.util.Scanner;

class reverseNumber {
     public static void main(String[] args) {
         Scanner input=new Scanner(System.in);
         System.out.println("Welcome to the converting reverse number");
         System.out.println("Please enter a number");
         int num=input.nextInt();
         int sum=0;
         while(num>0)
         {
         int rem=num%10;
         sum=sum*10+rem;
         num=num/10;
         }
         System.out.println("Your reverse number is "+sum);

     }
}
