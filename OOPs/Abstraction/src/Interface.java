 interface  I1 {
   public abstract void show();
   //if we create a method in interface then its necessary to define the public abstaract with method if we not define the public abstract with method
   // then compiler automatically define the public abstract

    public static final  int a=10;

    // if we create a any field  like as variable inside interface then its necessary to define the public static final with field
    // if we not define the public static final with field then compiler automatic define the public static final

   default void display(){
       System.out.println();
    }
    // we was not create a concrete method inside interface but after 8th version we can create a concrete method with default access modifier

   static void Display(){
    }
    //same after 8th version we can create a concrete method with static access modifier
}
class test1 implements I1{
    //interface can be achive by implements keyword

    @Override
    public void show() {
        System.out.println("1");
        System.out.println(a);
    }

    //all abstarct method of interface always compulsary to define in the sub class where interfecec will be implements but concrete method not compulsary

     // ek chij aur hamne method void show ke aage public lagaya hai because yha par method overriding ka rule follow hua hai and
    // method overriding me super class ke method me access modifier jo hota hai sub class ke method  me wahi access modifier hona chahiye ya usse adhik level wala
    // and yha par superclass ke method me automatic public access modifier hota hai isiliye hame subclass ke method me public access modifier
    // ya usse jyada wala access modifier lagana padega

    public static void main(String[] args) {
        test1 t=new test1();
        t.show();
    }
}
