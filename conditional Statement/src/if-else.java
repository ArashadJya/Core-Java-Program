import java.util.Scanner;
class A {
     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter a value of a");
         System.out.println("enter a value of b");
         int a=sc.nextInt();
         int b=sc.nextInt();
         if (a<b){
             System.out.println("a is smaller");
         }
         else {
             System.out.println("a is greater");
         }
     }
}
