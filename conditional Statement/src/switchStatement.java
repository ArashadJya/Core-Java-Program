import java.util.Scanner;

class D {
     public static void main(String[] args) {
       Scanner sc=new Scanner(System.in) ;
         System.out.println("Please enter a number of day ");
         int a=sc.nextInt();
         switch (a){
             case 1:
                 System.out.println("today is sunday");
                 break;
             case 2:
                 System.out.println("today is Monday");
                 break;
             case 3:
                 System.out.println("Today is Tuesday");
                 break;
             case 4:
                 System.out.println(" today is wedunesday");
                 break;
             case 5:
                 System.out.println("Today is thursday");
                 break;
             case 6:
                 System.out.println("Today is Friday");
                 break;
             case 7:
                 System.out.println("Today is Saturaday");
                 break;
             default:
                 System.out.println("Invalid input");
         }
     }
}
