import java.util.HashSet;
 class firstDuplicateElementsInArrayType2 {
     public static void main(String[] args) {
         int[] a={12,23,34,45,56,67,78,8,23,67,78};
         int temp=-1;
         HashSet<Integer> hs=new HashSet<>();
         for (int i=a.length-1;i>0;--i){
             if (hs.contains(a[i])){
                 temp=i;
             }
             //The java.util.HashSet .contains() ,method is udes to check whether a specific element is present in the
             // HashSet or not .so basically it is used to check if a Set contains any particular element
             //yha ham for loop ko right side se isliye chalaye hai kyuki hame first duplicate elements finds karna hai
             //isme ye ho rha hai ki for loop ulta chal rha hai aur ek ek karke elements ko hs.add(a[i]) me add kar rha hai
             //ydi same elements pahle se presents nhi hain tab aur yadi same elements pahle se present hai to add nhi karega
             //balki us index ko temp ke andar initialize kar dega
             else {
                 hs.add(a[i]);
             }
         }
         if (temp==-1){
             System.out.println("Elements not founds");
         }
         else{
             System.out.println("First Duplicates elements are "+a[temp]);
         }
     }
}
