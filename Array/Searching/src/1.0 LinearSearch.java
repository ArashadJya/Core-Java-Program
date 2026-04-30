 class LinearSearch {
     public static void main(String[] args) {
         int[] a={10,20,40,50,70,87,56,43,87,97,};
         //search karna hai 43  ko ki wo kis position par hai
         int item=43;
         int temp=0;
         for (int i=0;i<a.length;++i){
             if (a[i]==item){
                 System.out.println("item is presente at "+i+" index position");
                 temp=temp+1;
                 break;
             }
         }
         if (temp==0){
             System.out.println("item is not found in this List");
         }
     }
}
