 class findKthSmallestElement {
     public static void main(String[] args) {
         int[] a={12,23,34,32,45,56,67,78,89,98,76,65,43,45,33,56,543,};
         int k=5;
         System.out.print("There are 5 smallest element of the array is ");
         for (int i=0;i<a.length;++i){
             for (int j=i+1;j<a.length;++j){
                 if (a[i]>a[j]){
                     int temp=a[j];
                     a[j]=a[i];
                     a[i]=temp;
                 }
             }
                     System.out.print(+a[i]+" ");
             if (i==k-1){
                 System.out.println();
                 System.out.println( k +"th smallest element is "+a[i]);
                 break;
             }
         }
             System.out.print("Your series is");
         for (int i=0;i<a.length;++i){
             System.out.print(a[i]+" ");
         }
     }
}
