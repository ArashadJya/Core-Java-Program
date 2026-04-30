 class test2 {
    void show(StringBuffer a){
        System.out.println(" StrinfBuffer Method");
    }
    void show(String a){
        System.out.println("String method");
    }

     public static void main(String[] args) {
         test2 t=new test2();
         t.show("abc");
         t.show(new StringBuffer("xyz"));
     }
}
