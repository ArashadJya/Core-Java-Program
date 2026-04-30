class testing
{
   static int a=10;
    static int b=17;
    //static keyword only use in the only class instance variable it is not use in the local variable
   void m1(){

       int b=12;   //here we can not use static keyword because it is a local variable
       System.out.println(b);
   }
}
class tester{
    public static void main(String[] args) {
        System.out.println(testing.a);
        System.out.println(testing.b);
        testing t=new testing();
        t.m1();
        //we can pass the static variable in other class using class name of the static variable without creating the object
        //hgam static variable ko same class me directly access kar sakte hai but another class me access karne ke liye
        // class name ke through access karna padega
    }
}
