import java.util.HashSet;

class deleteDuplicateElement2 {
     public static void main(String[] args) {
         //third way by HashSet  this sort the both sorted and unsorted array
         int[] arr={10,20,20,20,30,30,30,40,40,50,50,60,60,70};
         HashSet<Integer> hs=new HashSet<>();
         for (int i=0;i<arr.length;++i){
             hs.add(arr[i]);
         }
         for (int no:hs){
             System.out.print(no+" ");
         }
     }
}
