 class B1 {
    B1(){
        System.out.println("I am in class B1");
    }
}
class c1 extends B1{
    c1(){
        super();
        System.out.println("I ma in class c1");
    }

    public static void main(String[] args) {
        c1 ob=new c1();
    }
}
//use3
 //super() method is used to invoke the parent class constructor