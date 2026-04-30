import java.util.Scanner;

class primeNobwTwoNo {
     public static void main(String[] args) {
         Scanner input=new Scanner(System.in);
         System.out.println("welcome to the find prime number between two number");
         System.out.println("please enter a first number");
         int a=input.nextInt();
         System.out.println("Please enter a second number");
         int b=input.nextInt();
         int count=0;
         for (int k=a;k<b;++k){
             for (int i=2;i<k;++i){
                 if (k%i==0){
                     count=count+1;
                 }
             }
             if (count==0){
                 System.out.print(" "+k);
             }
             else{
                 count=0;
             }

         }
     }
}
