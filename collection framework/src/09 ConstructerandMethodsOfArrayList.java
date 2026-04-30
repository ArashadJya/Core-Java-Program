import java.awt.*;
import java.util.ArrayList;
import java.util.Iterator;

class ArrayListDemo   {
     public static void main(String[] args) {
        // There is a three type of constructer of ArrayList
//         1 constructer without initial capicity
//         2 constructer with initial capicity
//         3 collection constructer
          //constructer 1 constructer without initial capicity
         ArrayList all=new ArrayList();
          all.add(10);
          all.add(20);
          all.ensureCapacity(5);
          all.add(45);
          all.add(54);
          all.add(547);
          all.add(43);
         System.out.println(all);

         //constructer 2 constructer with initial capicity
         ArrayList al1=new ArrayList(6);
         al1.add(34);
         al1.add(65);
         al1.add(34);
         al1.add(68);
         al1.add(43);
         al1.add(45);
         al1.add(98);
         System.out.println(al1);

         //constructer3 collection constructer
         ArrayList al2=new ArrayList(al1);
         al2.add(76);   //it is used to add the element in yhe collection object
         al2.add(76);
         al2.add(23);
         al2.add(87);
         System.out.println(al2);

         //Methods
         al2.add(13);  //This is a part of collection which is inherit from the collection in the list and
         // it is used to add the element in the collection object
         al2.add(98);
         al2.add(34);
         al2.add(null);
         al2.add(null);
         al2.remove(null);  //it is used to remove the element in the collection object
//         al2.remove(34);
         al2.add(1,23); //This is a part of list itm is used to add the element in the
         // collection object using index based
         al2.removeAll(al1);
         //removeAll() method is used to remove the elements from the current ArrayList which are contained
         // int he specified ArrayList or say collection object
         System.out.println(al2);
         System.out.println(al2.contains(98));
         //it is used to check if the specified element is present in the given ArrayList or not
         // it return output in true and false
         System.out.println("size of the al2 collection object "+al2.size());
         //it is used to count he size of the object
         System.out.println( "element of index position 3 is "+al2.get(3));
         //it is used to get the single element with specific index position
         System.out.println(al2.set(2,54));
         //it is used to set element in specific index position
         System.out.println("After set() "+al2);
         System.out.println("Index position of 87 is "+al2.indexOf(87));
         //it is used to get the index position of this object
         Iterator itr= al2.iterator();
         while (itr.hasNext()){
             System.out.println(itr.next());
         }
         //it is used to iterate the element one by one

         al2.clear();
         //it is used to remove the element from this object
         System.out.println("After clear method "+al2);
     }
}
