 class A {
    int a=10;
}
class B extends A{
    int a=20;
    void show(int a){
        System.out.println(a);   //This will be print 12
        System.out.println(this.a);// This will be print 20
        System.out.println(super.a);//This will be  print 10
    }
    public static void main(String[] args) {
        B ob1=new B();
        ob1.show(12);
}
    }
//In Java, the super keyword refers to the immediate parent class (superclass) of the current object.