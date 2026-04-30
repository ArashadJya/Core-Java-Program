import java.util.Scanner;

//This is a example of customized exception using compile time exception
//class UnderAgeException extends Exception {
//    UnderAgeException(){
//        super("You are under age");
//    }
//    UnderAgeException(String msg){
//        super(msg);
//    }
//}
class Vooting{
    public static void main(String[] args)  {
        System.out.println("Please enter your age ");
        Scanner sc =new Scanner(System.in);
        int age =sc.nextInt();
        try{
            if(age<18){
                throw new Exception("You can not vote because your age is below 18");
            }
            else{
                System.out.println("You can vote");
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

}
