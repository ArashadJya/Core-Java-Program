import com.sun.source.doctree.SeeTree;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class HashMapDemo {
     public static void main(String[] args) {
          HashMap hm=new HashMap();
          hm.put(101,"jya");
          hm.put(102,"khan");
          hm.put(103,"arashad");
          hm.put(104,"hamid");
          System.out.println(hm);
          // How to reterive the elements

          Set set=hm.entrySet();
          System.out.println(set);  //we can set the element of HashMap in the set

         Iterator itr= set.iterator();
         while (itr.hasNext()){
//              System.out.println(itr.next());  This is used to retrieves the key value pair together
              Map.Entry entry=(Map.Entry) itr.next();
              System.out.println(entry.getKey()+"  "+entry.getValue());
              //iske dwara ham key and value ko alag alag print karwa sakte hai
         }


     }
}
