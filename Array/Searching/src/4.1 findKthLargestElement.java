 class findKthLargestElement {
     public static void main(String[] args) {
         int[] a={12,23,323,54,65,45,34,32,34,34,5,43,5,75,86,54,743,743,};
         //we want to find the 5th largest element position
         int temp;
         for(int i=0;i<a.length;++i){
             for (int j=i+1;j<a.length;++j){
                 if (a[i]<a[j]){
                     temp=a[j];
                     a[j]=a[i];
                     a[i]=temp;
                 }
             }
             if (i==5){
                 break;
             }
         }
         for (int i=0;i<a.length;++i){     //ham is for loop ka use khud ko dekhne ke liye kiya hai ki ye hamne 5 index par sorting karna
                                            //break kiya hai to hame dekhna hai ki ye 5th index position tak hi kiya hai ya nhi
             System.out.print(a[i]+" ");
         }
         System.out.println();
         System.out.println(" 5th largest index position is "+a[5]);
     }
}
