 class methodOverriding {
    void show(){
        System.out.println("1");
    }
}
class B extends methodOverriding{
    void show(){
        System.out.println("2");
    }

    public static void main(String[] args) {
        B t=new B();
        methodOverriding p=new methodOverriding();
        p.show();
        t.show();
    }
}
