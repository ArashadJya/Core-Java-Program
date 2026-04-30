 class findIndexOfAnArrayElement {
     public static void main(String[] args) {
         int[] a={10,20,30,40,50,60};
         //find index of element 50
         for (int i=0;i<a.length;++i){
             if (a[i]==50){
                 System.out.println("Index Number is "+i);
             }
         }
     }
}
