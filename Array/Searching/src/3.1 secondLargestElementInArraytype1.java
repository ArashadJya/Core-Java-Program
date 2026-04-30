 class secondLargestElementInArray {
     public static void main(String[] args) {
         int[] a={10,23,4,567,45,3,5,36,35,754,67644,75,23,5,2,6432,};
         int temp;
         for (int i=0;i<a.length;++i) {
             for (int j = i + 1; j < a.length; ++j) {
                 if (a[i] < a[j]) {
                     temp = a[i];
                     a[i] = a[j];
                     a[j] = temp;
                 }
             }
             if (i==1){             //yha par ham i=1 par break isliye kar diye hai kyuki hame a[1] ki hi value nikalni hai jaise i=1 par sorted ho jayega ham uske baad program ko terminate kar denge isse hamara time bachega
                 break;
             }
         }

         System.out.println("second largest element is "+a[1]);
     }
}
