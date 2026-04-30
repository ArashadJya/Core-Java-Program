import java.util.Scanner;

class factorial {
     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println("Welcome to the factorial program using recursion");
         System.out.println("Please enter a number ");

         int num=sc.nextInt();
         factorial f=new factorial();
         int result =f.calfact(num);
         System.out.println(result);
     }

     int calfact(int num) {
         if (num <= 1) {
             return 1;
         }
         return num *calfact(num-1);
     }
 }
