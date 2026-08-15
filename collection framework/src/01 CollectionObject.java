import java.util.ArrayList;
import java.util.HashSet;
class collection {
    public static void main(String[] args) {
        //This is a example of collection object that how to create a collection object
        //we can not create a object of Interfcae
        ArrayList al=new ArrayList();
//        collection framework me ham directly primitive type ko store nahi kar sakte because collection framework store only object
//          solution
//        first Of all convert the primitive data into object
//        convert the primitive data type into his wraper class and can store
        al.add(10);     //autoboxing  int->Integer
        al.add("jya");
        al.add('c');
        System.out.println(al);
        HashSet hs=new HashSet();
        hs.add(10);
        hs.add("khan");
        hs.add('c');
        System.out.println(hs);


    }
}
