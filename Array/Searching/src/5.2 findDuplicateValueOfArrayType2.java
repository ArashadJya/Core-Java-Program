import java.util.Set;
import java.util.HashSet;
class findDuplicateValueOfArrayType2 {
     public static void main(String[] args) {
         //using SET INTERFACE
         int[] a={12,23,34,45,56,67,78,2,89,1,2,3,4,5,6,7,8,9,2,4,6,8,};
         System.out.print("duplicate elements are ");
         Set<Integer> s=new HashSet<>();
         for (int no:a){
             if (s.add(no)==false){
                 System.out.print(no+" ");
             }
         }

     }
}
