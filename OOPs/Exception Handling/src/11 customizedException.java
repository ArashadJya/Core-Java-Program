//This is a example of customized exception using Runtime Exception
import java.util.Scanner;
class UnderAgeExceptions extends RuntimeException {
    UnderAgeExceptions(){
        super("You are not eligible");
    }
    //ham exceptiom class ke constructer me super() ke andar statement likh sakte hai kyuki ye string class ko accept
    // karta hai but normal class ke constructyer ke super ke andar statement nhi likh sakte

    UnderAgeExceptions(String msg){
        super(msg);
    }
}
class votiing{
    public static void main(String[] args) {
        System.out.println("Please enter a age");
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        try{
            if (age<18){
                throw new UnderAgeExceptions();
            }
            else{
                System.out.println("You are eligible for vote");
            }
        } catch (UnderAgeExceptions e) {
            e.printStackTrace();
        }
    }
}
