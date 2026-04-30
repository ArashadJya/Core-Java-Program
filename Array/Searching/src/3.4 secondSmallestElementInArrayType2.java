 class secondSmallestElementInArrayType2 {
     public static void main(String[] args) {
         int[] a={12,23,34,45,56,67,78,89,90,99,88,77,66,65,54,43,33,21,};
         int smallest=Integer.MAX_VALUE;
         int secondsmallest=Integer.MAX_VALUE;
         for (int i=0;i<a.length;++i){
             if (a[i]<smallest){
                 secondsmallest=smallest;
                 smallest=a[i];
             } else if (a[i]<secondsmallest&&a[i]!=smallest) {
                 secondsmallest=a[i];
             }
         }
         if (secondsmallest==Integer.MAX_VALUE){
             System.out.println("Element not found");
         }
         else{
             System.out.println("Second smallest element is "+secondsmallest);
         }
     }
}
