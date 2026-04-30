 class dem0 {
   final void m1(){
        System.out.println("I am in demo class");
    }
}
class Demo1 extends dem0{

//    void m1(){
//        System.out.println("I am in demo class");
//    }
    public static void main(String[] args) {
       Demo1 d=new Demo1();
       d.m1();
    }
}
