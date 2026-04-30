 class minValueInArray {
     public static void main(String[] args) {
         int[] a={12,23,4,534,65,76,87,98,4,5,6,745,3,6,1};
         int min=a[0];
         for (int i=1;i<a.length;++i){
             if (min>a[i]){
                 min=a[i];
             }
         }
         System.out.println("Your minimum value is "+min);
     }
}
