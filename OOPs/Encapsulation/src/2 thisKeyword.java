 class test {
    int i;
    //this is  a instance variable
    void Values(int i){   //this is a local variable
        this.i=i;
        //agar ham this.i ke jagah par only i likh de to to wah local variable hi rahega yah instance variable nhi lega
        // jiske karan left hand side and right side dono local variable hi rahega aur ham usme 10 pass kiye hai to
        // dono jagah 10 hi rahega but agar ham variable ke sath this keyword laga de to wah instance variable ko hi define karega
    }
    void show(){
        System.out.println(i);
    }
}
class xyz{
    public static void main(String[] args) {
        test t=new test();
        t.Values(10);
        t.show();
    }
}
//this keyword is the reference variable that refers to the current class it is basically use when the local variable name
// and instance variable name same ho
