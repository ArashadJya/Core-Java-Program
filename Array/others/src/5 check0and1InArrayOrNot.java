 class check0and1InArrayOrNot {
     public static void main(String[] args) {
         //check karna hai 0 and -1 array me hai ya nahi
         int[] a={2,3,4,5,8,7};
         boolean isvalid=true;
         for (int i=0;i<a.length;++i){
             if(a[i]==0 ||a[i]==-1){
                 isvalid=false;
                 break;
             }
         }
         if(isvalid){
             System.out.println("0 and -1 not found in array");
         }
         else{
             System.out.println("0 or -1 found in Array");
         }
     }
}
