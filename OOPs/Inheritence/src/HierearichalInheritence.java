 class Parrents {
    void question(){
        System.out.println("How are you");
    }
}
class firstChild extends Parrents{
    void answer(){
        System.out.println("First child");
        System.out.println("I am fine");
    }
}
class secondChild extends Parrents{
    void answer1(){
        System.out.println("Second child");
        System.out.println("I am not fine");
    }

    public static void main(String[] args) {
       firstChild ob=new firstChild();
       secondChild oc=new secondChild();
       ob.question();
       ob.answer();
       oc.question();
       oc.answer1();

    }
}
