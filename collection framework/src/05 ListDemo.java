import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class ListDemo {
     public static void main(String[] args) {
       List l=new ArrayList();
       l.add(12);
       l.add(13);
       l.add(14);
       l.add(16);
       l.add(16);
       l.add(null);
       l.add(null);
         System.out.println(l);
         Iterator itr=l.iterator();
         while (itr.hasNext()){
             System.out.println(itr.next());
         }
     }
}
//Lits follow the insertion order
// List can store any  number of null values
