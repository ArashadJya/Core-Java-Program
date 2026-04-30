import java.util.Scanner;

class primeNumber {
     public static void main(String[] args) {
         Scanner input=new Scanner(System.in);
         System.out.println("Welcome to our checking prime number");
         System.out.println("please enter a number");
         int num=input.nextInt();
         int count=0;
         for (int i=2;i<num;++i){
             if (num%i==0){
                ++count;
             }
         }
         if (count==0){
             System.out.println("Your number is prime");
         }
         else {
             System.out.println("Your number is not prime");
         }

     }
}
