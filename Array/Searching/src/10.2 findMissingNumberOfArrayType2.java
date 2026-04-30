 class findMissingNumberOfArrayType2 {
     public static void main(String[] args) {
         int[] a={1,2,3,4,5,6,8};
         int ExpectedLength=a.length+1;
         int mul1=1;
         for (int i=2;i<=ExpectedLength;++i){
             mul1= mul1^i;}
         int mul2=a[0];
         for (int i=1;i<a.length;++i){
             mul2=mul2^a[i];
         }
         System.out.println("Missing Number is "+(mul2^mul1));
     }
}
