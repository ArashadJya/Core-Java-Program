import java.util.Scanner;

class palindromeNumber {
     public static void main(String[] args) {
         Scanner input=new Scanner(System.in);
         System.out.println("Please enter a number");
         int num=input.nextInt();
         int temp=num;
         int sum=0;
         while(temp>0){
             int digit=temp%10;
             sum=sum*10+digit;
             temp=temp/10;
         }
         if (num==sum){
             System.out.println("This number is palindrome");
         }
         else{
             System.out.println("This number is not palindrome");
         }
     }
}
