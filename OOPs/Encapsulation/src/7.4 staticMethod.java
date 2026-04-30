 class Test3 {
    int i=2;
    void display(int i){
        System.out.println("display method");
        System.out.println(this.i);
    }
    static void show(){
        System.out.println("show method");
    }
     public static void main(String[] args) {
         Test3 t=new Test3();
         t.display(6);
         Test3.show();
     }
}
