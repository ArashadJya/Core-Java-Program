 class BinarySearch {
     public static void main(String[] args) {
         int[] a={2,3,4,6,8,9,12,23,34,45,56,67,78,89,98};
         //45 in this List
         // binary search ke help se item ko search karne ke liye array ko sorted order me rehna jaruri hai
         int item=45;
         int li=0;  //lower index of Array
         int hi=(a.length)-1;   //higher index of Array
         System.out.println(hi);
         int mid=(li+hi)/2;
         System.out.println(mid);
         while (li<=hi){
             if (a[mid]==item){
                 System.out.println("item is present at "+mid+" index position");
             }
             if (a[mid]<item){
                 li=mid+1;
             }
             else {
                 hi=mid-1;
             }
             mid=(li+hi)/2;
         }
         if (li>hi){
             System.out.println("item not found");
         }
     }
}
