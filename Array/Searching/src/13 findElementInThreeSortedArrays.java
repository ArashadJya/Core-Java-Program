import java.util.HashSet;

class findElementInThreeSortedArrays {
     public static void main(String[] args) {
         int[] ar1={2,4,8};
         int[] ar2={2,3,4,8,10,16};
         int[] ar3={2,8,8,8,4,14};
         HashSet<Integer> hs1=new HashSet<>();
         HashSet<Integer> hs2=new HashSet<>();
         HashSet<Integer> hs3=new HashSet<>();
         System.out.print("Duplicates Elements are ");
         for (int i=0;i<ar1.length;++i){
             hs1.add(ar1[i]);
         }
         for (int j=0;j<ar2.length;++j){
            boolean b= hs1.add(ar2[j]);
            if (b==false){
                hs2.add(ar2[j]);
            }
         }
         for (int k=0;k<ar3.length;++k){
           boolean c=  hs2.add(ar3[k]);
           if (c==false){
               hs3.add(ar3[k]);
           }
         }
         for (int no:hs3){
             System.out.print(no+" ");
         }
     }
}
