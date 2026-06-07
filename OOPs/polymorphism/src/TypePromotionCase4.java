 class test3 {
    void show(int a,float b){
        System.out.println("int and float method");
    }
    void show(float a,int b){
        System.out.println("float and int method");
    }

     public static void main(String[] args) {
         test3 t=new test3();
         t.show(2,4.5f);
         t.show(4.5f,4);
//         t.show("abc",4);
         //in this two same data type have in this method then compiler will
         // be confused and provide to the ambugity error
     }
}
