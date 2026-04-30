import java.util.HashMap;
import java.util.Map;

class mapDemo {
     public static void main(String[] args) {
        Map m=new HashMap() ;
        //in the implemented class of map interface put() is used to the add the object in the form of
         // key and value pair
        //we van not create a object of Map because it is a interface but we can create a object of
         // implemented class of map and give to the references of Map

         //Method Started
         m.put(100,"deepak");
         m.put(200,"khan");
         m.put(300,"Arashad");
         m.put(400,"arif");
         m.put(500,"afzal");
         System.out.println(m);
         System.out.println(m.containsKey(100));
         //it is used to check the key is present or not in the object of the implemented classes of the map
         System.out.println(m.containsValue("khan"));
         //it is used to check the value is present or not in the object of the  implemented classes of the map

         System.out.println(m.get(200));
         //it is used to get the value according to the key
         m.remove(200);

         m.replace(200,"Hamid");

         System.out.println(m.size());
         m.clear();//it is used to clear the object of the implemented class of the map
         System.out.println(m);
     }
}
