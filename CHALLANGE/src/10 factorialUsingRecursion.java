import java.util.Scanner;

class factorialUsingRecursion {
    static  int fact=1;
     public static void main(String[] args) {
         Scanner input=new Scanner(System.in);
         System.out.println("Welcome  to the calculating factorial using recursion");
         System.out.println("Please enter a number");
         int num=input.nextInt();
         factorialUsingRecursion ob=new factorialUsingRecursion();
         ob.calcfact(num);
         System.out.println("factorial of "+num+" is "+fact);
     }
     void calcfact(int num){
         if (num>=1){
             fact=fact*num;
             calcfact(num-1);
         }
     }
}
