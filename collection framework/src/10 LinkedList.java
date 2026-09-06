import java.util.ArrayList;
import java.util.LinkedList;

class linkedList {
     public static void main(String[] args) {
         ArrayList al=new ArrayList();
         al.add(100);
         al.add(200);
         al.add(300);
         al.add(400);
         al.add(null);
         al.add(null);
         LinkedList ll=new LinkedList(al);

         ll.add(23);
         ll.add(45);
         ll.add(98);
         ll.add(54);
         ll.add("khan");
         ll.add("jya");
         ll.add("khan");
         ll.add(null);
         ll.add(null);
         ll.add("Arashad");
         ll.add(65);
         System.out.println(ll);
         ll.removeFirst();
         System.out.println(ll);

     }
}
