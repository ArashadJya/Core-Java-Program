 class test4 {
    void show(int a){
        System.out.println("int method");
    }
    void show(int...a){
        System.out.println("Varargument method");
    }

     public static void main(String[] args) {
         test4 t=new test4();
         t.show(4);
         t.show(2,2,2);
         t.show();
     }
}
