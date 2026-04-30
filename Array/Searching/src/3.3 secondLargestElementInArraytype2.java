 class secondLargestElementInArraytype2 {
     public static void main(String[] args) {
         int[] a={12,23,32,43,34,34,32,43,43,2,43,35,35};
         int largest=Integer.MIN_VALUE;
                 int secondLargest=Integer.MIN_VALUE;
                 for (int i=0;i<a.length;++i){
                     if (a[i]>largest){
                 secondLargest=largest;
                 largest=a[i];
             } else if (a[i]>secondLargest   &&  a[i] <largest) {
                 secondLargest=a[i];
             }
         }
         if (secondLargest==Integer.MIN_VALUE)
         {
             System.out.println("Element not found");
         }
         else {
             System.out.println("second Largest Element is "+secondLargest);
         }
     }
}
