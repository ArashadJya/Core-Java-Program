import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

class ListItr {
     public static void main(String[] args) {
         List l=new ArrayList();
         l.add("jya");
         l.add("khan");
         l.add(12);
         l.add(34);
         l.add(54);

         ListIterator li=l.listIterator();
         while (li.hasNext()){   //it retrieves the element in forward direction
             System.out.println(li.next());
         }

         System.out.println("cursor reached in end point");
         while (li.hasPrevious()){   //it retrieves the element in backward direction
             System.out.println(li.previous());
         }
//         li.add(123);
//         System.out.println(l);
         //listIterator ke andar add() ke use se ham element add kar sakte hai but ham isko print karne
         // ke liye object ko hi print karenege

         li.set(100);  //it is used to replace the element ye usi element ko replace karega jha par us time par cursor rahega
//         System.out.println(l);

     }
}
