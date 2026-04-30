 interface In1 {
    void show();
    int a=19;
}
                            //    This is a example of Multiple Inheritence using Interface
interface In2{
    void display();
    int b =18;
}
class Test implements In2,In1{
    @Override
    public void show() {
        System.out.println("Interface In1");
        System.out.println(a);
    }

    @Override
    public void display() {
        System.out.println("Interface In2");
        System.out.println(b);
    }

    public static void main(String[] args) {
        Test t=new Test();
        t.show();
        t.display();
    }
}
