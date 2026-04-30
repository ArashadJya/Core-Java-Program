 class findDuplicateValueOfArray {
     public static void main(String[] args) {
         int[] a={12,23,34,45,56,67,7889,98,77,65,54,423,23,45};
         //BRUTE FORCE METHOD
         System.out.print("Duplicates elements are ");
         for (int i=0;i<a.length;++i){
             for (int j=i+1;j<a.length;++j){
                 if (a[i]==a[j]){
                     System.out.print(a[j]+" ");
                 }
             }
         }
     }
}
