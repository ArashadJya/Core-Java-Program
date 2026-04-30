import java.util.TreeMap;

class TreeMapDemo {
     public static void main(String[] args) {
         TreeMap tm=new TreeMap();
         tm.put(105,"sibu");
         tm.put(102,"khan");
         tm.put(101,"jya");
         tm.put(104,"arif");
         tm.put(110,"Arashad");
         System.out.println(tm);

//         tm.put("sibu",105);
//         tm.put("khan",102);
//         tm.put("jya",104);
//         tm.put("arif",101);
//         tm.put("Arashad",013);
         //it sorted a element with key respected

         System.out.println(tm.ceilingEntry(102));
         System.out.println(tm.ceilingEntry(103));
         //it return the value according to the key agar yeh present hai to usiki value print karega and
         // agar present nhi hai to ussue bada jo key milega usiki value print karega

         System.out.println(tm.ceilingKey(104));
         // it provides a only key

//         tm.clear();
         //it will clear the all elements

         System.out.println(tm.containsKey(103));
         //it used to check this key is present or not

         System.out.println(tm.firstEntry());
         //it is used to print the first key,value pair

         System.out.println(tm.floorEntry(111));
         //it get the element less then or equalto element

         System.out.println(tm.get(103));
         //it is used to get the value of the key but if key are not present then it return a anull value

         System.out.println(tm.headMap(101));
         //ye is key ke pahle wale ka entry means key and value pair return karega

         System.out.println(tm.higherEntry(103));
         System.out.println(tm.higherEntry(105));
         //it return the greatest element from their but if not find a greatest entry fron their then it returns a null

         System.out.println(tm.keySet());
         //it return the all the key

         System.out.println(tm.pollFirstEntry());
         //it used to remove the first entry
         System.out.println(tm);

         System.out.println(tm.pollLastEntry());
         //it is used to remove the last entry
         System.out.println(tm);

         System.out.println(tm.remove(102));
         System.out.println(tm);
         //it used tot remove to the key

         tm.replace(104,"aaa");
         System.out.println(tm);
         //it used to replace the value of this key

     }
}
