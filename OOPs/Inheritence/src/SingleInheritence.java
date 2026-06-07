 class A {
    void show1(){
        System.out.println("A class method");
    }
}
class B extends A{
    void show2(){
        System.out.println("B class method");
    }

    public static void main(String[] args) {
        B ob=new B();
        ob.show2();
        ob.show1();



    }

}
