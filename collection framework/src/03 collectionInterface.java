import java.util.ArrayList;
class collectionDemo {
     public static void main(String[] args) {
         ArrayList al=new ArrayList();
         al.add(10);
         al.add('c');
         al.add('d');
         al.add(19);
         al.add("jya");
         al.add(23.45);
         System.out.println(al);
         al.add(0,"Arashad");  //this method is basically used to the add the element on the specific index
         //add() is basically used to the add the element inside the collection object, and we know that
         // collection is store a hetrogeneous type of data
         System.out.println("al.add(10)"+al.add(10));
         //if the element is sucessfully add in the object then it returns true otherwise false
         System.out.println(al.contains(20));
         //it is basically used to check this element contain in the object or not
         System.out.println(al.isEmpty());
         //it is basically used to check this object is empty or not
         System.out.println(al.size());
         //it is basically used to count the size of the object
         System.out.println(al);
         al.remove(2);
         //it is basically use to remove the particular element from the collection object
         System.out.println(al);

         ArrayList al2=new ArrayList();
         al2.add("aaa");
         al2.add("bbb");
         al2.add("ccc");
         System.out.println(al2);


         al2.addAll(al);//it is basically used to add the collection object in other  collection object isme basically al object al2 ke andar add ho gya hai
         System.out.println(al2);
     }
}
