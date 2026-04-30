 class ThisDemo4 {
    void m1(ThisDemo4 td){
        System.out.println("I am in m1 method");
    }
    void m2(){
       m1(this);
        System.out.println("I am in m2 method");
    }

    public static void main(String[] args) {
        ThisDemo4 td =new ThisDemo4();
        td.m2();
    }
}
//USE 4
 // This keyword can be used to pass an argument in method call
 //it means agar ham ek class ke andar do method banaye hai to ham ek method ko ham dusre method ke andar pass kara sakte hai
 // kewal argument ke jagah par this keyword ka use karke
