import java.util.Scanner;
class fibonacciSeries {
     public static void main(String[] args) {
         Scanner input=new Scanner(System.in);
         System.out.println("Please enter the number of terms who want to print the fibonacci series up to n terms");
         System.out.println("Please enter e number of terms");
         int num=input.nextInt();
         int first=0;
         int second=1;
         System.out.print("0 ");
         System.out.print("1 ");
         for (int i=1;i<num-1;++i){
             int third=first+second;
             System.out.print(third+" ");
             first=second;
             second=third;
         }

     }
}
