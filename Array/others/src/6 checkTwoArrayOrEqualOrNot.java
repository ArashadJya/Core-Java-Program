 class checkTwoArrayOrEqualOrNot {
     public static void main(String[] args) {
         int[] a={2,4,6,8,9};
         int[] b={2,4,6,8,8};

         boolean isequal=true;
         for (int i=0;i<a.length;++i){
             if(a[i]!=b[i]){
                 isequal=false;
                 break;
             }
         }
         if(isequal){
             System.out.println("Array are equal");
         }
         else{
             System.out.println("Array are not equal");
         }
     }
}
