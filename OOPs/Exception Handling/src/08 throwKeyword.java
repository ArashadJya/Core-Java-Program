import java.util.Scanner;


class voting{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Please enter your age");
        int age=s.nextInt();
       try {


           if (age < 18) {
               throw new ArithmeticException("Yoy are not eligible for voting");
           } else {
               System.out.println("You are eligible for voting");
           }
       }
        catch (ArithmeticException e) {
            System.out.println("e.printStackTrace");
               e.printStackTrace();

            System.out.println("e.getmessage()");
            System.out.println(e.getMessage());
       }
        System.out.println("hello");

    }
    }
    //throw keyword is manually used to create a exception  object pass to the jvm but exception not handled
