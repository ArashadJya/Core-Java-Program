//This is a example of static block
class test4 {
    static {
        System.out.println("Static block");
//        System.exit((0));        // it is uses to terminate the program
    }
    static {
        System.out.println("second static block");
    }
     public static void main(String[] args) {
         System.out.println("I am in main method");
     }
     static {
         System.out.println("third static block");
     }
}
