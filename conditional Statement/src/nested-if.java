import java.util.Scanner;

class C {
     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println("do you have a License? (true/false or yes/no");
         String license=sc.nextLine().trim().toLowerCase();

         System.out.println("Enter your age");
         int age=sc.nextInt();

         boolean hasLicense;
         if(license.equals("true")||license.equals("yes")){
              hasLicense=true;
         } else if (license.equals("false")||license.equals("no")) {
              hasLicense=false;
         }
         else{
             System.out.println("input is invalid");
             return;
         }
         if (age>18){
             if(hasLicense==true){
                 System.out.println("You can drive");
             }
             else{
                 System.out.println("Your age is above 18 but you have not a Licence First of all you made a LIcence,Then drive");
             }
         }
         else{
             System.out.println("You can not drive  ");
         }
     }
}
