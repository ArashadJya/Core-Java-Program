 class ThisDemo1 {
    int i;
    void value(int i){
        this.i=i;
    }
    void show(){
        System.out.println(i);
    }

     public static void main(String[] args) {
         ThisDemo1 td=new ThisDemo1();
         td.value(100);
         td.show();
     }
}
//USE THIS KEYWORD 1
 //This keyword is used to invoke current class instance variable
 //iska matalab agar ek hi class ke andar instance variable name and global variable name same ho to ham instance
 // variable define karne ke liye this keyword ka use kar sakte hai
