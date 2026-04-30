 class secondSmallestElementInArrayType1 {
     public static void main(String[] args) {
         int[] a={23,45,67,8,9,6,43,54,23,54,6,5,2,76423,653,236,32,6753,2568,3,6742,753,743,633,};
         int temp;
         for (int i=0;i<a.length;++i){
             for (int j=i+1;j<a.length;j++){
                 if (a[i]>a[j]){
                     temp=a[j];
                     a[j]=a[i];
                     a[i]=temp;
                 }
             }
             if (i==1){
                 break;
             }
         }
         for (int i=0;i<a.length;++i){
             System.out.print(a[i]+" ");}
         System.out.println();
         System.out.println("second largest element is "+a[1]);
     }
}
