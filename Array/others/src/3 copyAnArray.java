 class copyAnArray {
     public static void main(String[] args) {
         int[] a={10,20,30,40,50};

         int[] newarr=new int[a.length];

         for (int i=0;i<a.length;++i){
             newarr[i]=a[i];
         }
         for (int i=0;i<newarr.length;++i){
             System.out.print(newarr[i]+" ");
         }
     }
}
