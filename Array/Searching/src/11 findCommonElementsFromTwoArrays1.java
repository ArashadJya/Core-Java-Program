import java.util.HashSet;
class findCommonElementsFromTwoArrays {
     public static void main(String[] args) {
         //using nested Loop
         int[] ar1={1,2,3,4,5,6,6,6666,6,6,6};
         int[] ar2={5,6,7,8,9};
         System.out.print("Common Elements is ");
         HashSet<Integer> hs=new HashSet<>();
         for (int i=0;i<ar1.length;++i){
             for (int j=0;j<ar2.length;++j){
                 if (ar1[i]==ar2[j]){
                     hs.add(ar1[i]);
                 }
             }
         }
         for (int no:hs){
             System.out.print(no+" ");
         }
     }
}
