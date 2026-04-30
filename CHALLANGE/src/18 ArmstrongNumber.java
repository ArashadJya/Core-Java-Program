import java.util.Scanner;

class ArmstrongNumber {
     public static void main(String[] args) {
         Scanner input=new Scanner(System.in);
         System.out.println("Welcome to the checking Armstrong number");
         System.out.println("Please enter a number");
         int num=input.nextInt();
         int t1=num,length=0;
         while (t1!=0){
             t1=t1/10;
             length=length+1;
         }
         System.out.println("Lengthe of this number is "+length);
         int t2=num;
         int sum=0;
         int mul=1;
         while (t2!=0){
              int rem=t2%10;
              for (int i=1;i<=length;++i){
                 mul=mul*rem;
              }
             sum=sum+mul;
              t2=t2/10;
               mul=1;
         }
         if (num==sum){
             System.out.println("This is an armstrong number");
         }
         else{
             System.out.println("Not Armstrong Number");
         }

     }
}
