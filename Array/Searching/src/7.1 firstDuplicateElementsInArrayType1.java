 class firstDuplicateElementsInArray {
     public static void main(String[] args) {
         int[] a ={12,24,34,24,54,65,75,756,54};
         int temp=0;
         for (int i=0;i<a.length;++i){
             for (int j=i+1;j<a.length;++j){
                 if (a[i]==a[j]){
                     System.out.println("First Duplicates Elements are "+a[i]);
                     temp=temp+1;
//                     break;
                 }
             }
             if (temp>0){
                 break;
             }
         }
     }
}
