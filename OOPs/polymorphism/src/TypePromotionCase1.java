class Test {
    void show(int a){
        System.out.println("int method");
    }
    void show(String a){
        System.out.println("String method");
    }

    public static void main(String[] args) {
        Test t=new Test();
        t.show('a');
        //hamne yha par character ko input kiya hai lekin wo integer ko call kar diya character
        // ka method nhi yha isliye kyuki yha par automatic promotion ka use hua hai
    }
}
