class Teacher{
    void question(){
        System.out.println("How are you");
    }
}
class student extends Teacher{
    void answer(){
        System.out.println("I am fine");
    }
}
class Teacher1 extends student{
    void question1(){
        System.out.println("Ok Beta");
    }

    public static void main(String[] args) {
        Teacher1 ob=new Teacher1();
        ob.question();
        ob.answer();
        ob.question1();
    }
}
