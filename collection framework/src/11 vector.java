import java.util.Vector;

class vectorDemo{
     public static void main(String[] args) {
         Vector v=new Vector(); //initial capicity 10
//         Vector v=new Vector(6);  //we can change the initial capicity
         v.add("deepak");  //method of collection interface
         v.add("khan");
         v.add("jya");
         v.add(1,"khansahab");
         v.add(0,"Arashad");  //method of List interface
         v.addElement("arif");
         v.add(12);//method of vector class
         System.out.println(v);

         System.out.println(v.firstElement());//retrieve the first element
         System.out.println(v.lastElement()); //reterieve the last element
         System.out.println(v.removeElement("Arashad")); //remove the single elemnt of the object
         v.removeElementAt(1);   //remove the element using index position
         System.out.println(v);
         v.removeAllElements(); //remove the all elements
         System.out.println(v);
         System.out.println(v.capacity());         //capicity of vector class is 10, but when we insert the more than element of 10 then capacity of automatically increase in 2x form


     }
     }


