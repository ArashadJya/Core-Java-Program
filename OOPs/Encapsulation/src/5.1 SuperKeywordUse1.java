 class A1 {
    int i=19;
}
class A2 extends A1{
    int i=17;
    void show(int i){
        System.out.println(i);
        System.out.println(this.i);
        System.out.println(super.i);
    }

    public static void main(String[] args) {
        A2 ob=new A2();
        ob.show(13);
    }
}
//use1
 //super keyword is used to refer immediate parent class instance variable