class Test1 {
    // Constructor should be public
     Test1(ThisDemo td) {
        System.out.println("Test class constructor");
    }
}

class ThisDemo {
    void m1() {
        System.out.println("I am in m1 method");
        Test1 t = new Test1(this); // Passing 'this' to the Test constructor
    }

    public static void main(String[] args) {
        ThisDemo t = new ThisDemo();
        t.m1();
    }
}
//USE 5
//This keyword can be used to pass an argument in constructor call
//agar ek class ke andar ek constructor hai to ham dusre class ke method ke andar constructer ka object banakar usme argument ke jagah par
// this keyword ka use karke constructer ko call kara sakte hai

