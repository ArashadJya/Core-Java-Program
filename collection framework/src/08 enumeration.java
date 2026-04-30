import java.util.Enumeration;
import java.util.Vector;

class enumeration {
     public static void main(String[] args) {
         Vector v=new Vector();
         v.add(10);
         v.add(30);
         v.add(40);
         v.add("khan");
         System.out.println(v);

         Enumeration e=v.elements();

         while (e.hasMoreElements()){
             System.out.println(e.nextElement());
         }
     }
}
