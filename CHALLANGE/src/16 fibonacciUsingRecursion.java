import java.util.Scanner;
class fibonacciUsingRecursion {
    static int a=0,b=1,c;
     public static void main(String[] args) {
         Scanner input=new Scanner(System.in);
         System.out.println("Welcome to print fibonaccis series using n terms");
         System.out.println("please enter a number of terms ");
         int num=input.nextInt();
         System.out.print(a+" "+b);
         fibonacciUsingRecursion ob=new fibonacciUsingRecursion();
         ob.printfb(num);
     }
     void printfb(int i){
         if (i>2){
             c=a+b;
             System.out.print(" "+c);
             a=b;
             b=c;
             printfb(i-1);
         }
     }
}
