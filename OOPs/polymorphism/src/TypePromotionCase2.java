 class test {
    void show(Object a){
        System.out.println("Object method");
    }
    void show(String a){
        System.out.println("String method");
    }

     public static void main(String[] args) {
         test t=new test();
         t.show('a');
         t.show(1);
     }
}
