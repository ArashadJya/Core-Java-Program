import java.util.HashMap;
import java.util.Map;

class mapProperty {
     public static void main(String[] args) {
         Map m=new HashMap();
         m.put(100,"jya");
         m.put(200,"khan");
         m.put(300,"arashad");
         m.put(100,"khan bhai");  //properties 1
         //we can not store the duplicate key but if we store the duplicate key then value of
         // later duplicate key automatically store in the first duplicate key
         System.out.println(m);

         m.put(null,null);
         m.put(null,"aaaa");  //properties 2
         System.out.println(m);
         m.put(400,null);
         m.put(500,null);
         System.out.println(m);

         //we can not add a multiple null value in a key but we can add a multiple null value in a value
     }
}
