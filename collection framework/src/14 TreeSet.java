import java.util.TreeSet;

class TreeSetDemo {
     public static void main(String[] args) {
         TreeSet ts=new TreeSet();
//         ts.add(400);
//         ts.add(300);
//         ts.add(500);
//         ts.add(200);
//         ts.add(100);

         ts.add("jya");
         ts.add("khan");
         ts.add("arashad");
         ts.add("arif");
         ts.add("sibu");
         ts.add("tahir");
//         ts.add(null);
         System.out.println(ts);
         ts.remove("jya");
         System.out.println( "After removing jya"+ ts);
         ts.clear();
         System.out.println( "After clear() "+ ts);
         System.out.println(ts.comparator());
     }
}
