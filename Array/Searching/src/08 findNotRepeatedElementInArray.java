 class findNotRepeatedElementInArray {
     public static void main(String[] args) {
         int[] a={2,4,5,6,7,7,6,5,4,2,8};
         int result=0;
         for (int i=1;i<a.length;++i){
             result=result^a[i];
         }
         System.out.println("Non repeated element is "+result);
     }
}
