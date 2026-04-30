
class Test {

     public static void main(String[] args) {
         int a=10,b=0,c;
         try{
             c=a/b;
         System.out.println(c);
         }
         catch (ArithmeticException e){
             //if you do not know that what type of exception find in this program then you can  put only exception because
             // exception is the parent class of all the subclass
             System.out.println(e);
             System.out.println("You can not divid by 0");
         }
         System.out.println("Hello try catch block is finished");
     }
}
