 class B2 {
   void m1(){
       System.out.println("I am in class B2");
    }
}
class C2 extends B2{
    void m1(){
        System.out.println("I am in class C2");
    }
    void show(){
        this.m1();
        super.m1();
        System.out.println("I am in show method");
    }

    public static void main(String[] args) {
        C2 ob=new C2();
        ob.show();
    }
}
//super keyword is used to invoked the immediate parent class method
