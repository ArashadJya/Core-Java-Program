import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

class HashSetDemo {
     public static void main(String[] args) {
         ArrayList al=new ArrayList();
         al.add(100);
         al.add(200);
         al.add(300);
         al.add(400);
         HashSet hs=new HashSet(al);
         hs.add(10);
         hs.add("jya");
         hs.add(23.43);
         hs.add(40);
         hs.add(true);
         hs.add(40);
         //Hashset does not store duplicate elements
         hs.add(null);
         hs.add(null);
         //Hashset does not store multiple null values
         //Hashset ke andar jo element add hote hai wo actually taur par map object ke andar add hote hai
         System.out.println(hs);
         Iterator itr=hs.iterator();   //print through iterator, it is print the element one by one
         while (itr.hasNext()){
             System.out.println(itr.next());
         }
     }

}
