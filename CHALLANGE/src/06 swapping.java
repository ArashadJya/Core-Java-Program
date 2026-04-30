import java.util.Scanner;

class swapping {
     public static void main(String[] args) {
         Scanner input=new Scanner(System.in);
         System.out.println("Welcome to the swapping station");
         System.out.println("Please enter a first number");
         int a=input.nextInt();
         System.out.println("Please enter a second number");
         int b=input.nextInt();
         int c=a;
         a=b;
         b=c;
         System.out.println("after swapping the value oif a is "+a);
         System.out.println("after swapppimng the  value of b "+b);
     }
}
