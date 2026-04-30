 class ThisDemo6 {

    ThisDemo6 m1()
    {
        System.out.println("I am in m1 method");
        return this;
    }

    public static void main(String[] args) {
        ThisDemo6 td=new ThisDemo6();
        td.m1();
    }
}
//USE 6
 //This keyword can be used to return the current class instance from the method
