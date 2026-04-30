import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class itrDemo {
     public static void main(String[] args) {
         List l=new ArrayList();
         l.add(10);
         l.add(54);
         l.add(53);
         l.add(65);
         Iterator itr=l.iterator();
         while (itr.hasNext()){
             System.out.println(itr.next());
         }
         l.remove(3);
         //it is used to remove the element by using indexing number
         System.out.println(l);
     }
}
