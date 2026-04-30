 class findMissingNumberOfArray {
     public static void main(String[] args) {
         int[] a={1,2,3,4,5,7};
         int expectedLength=a.length+1;
         int totalSum=(expectedLength*(expectedLength+1))/2;
         int sum=0;
         for (int i=0;i<a.length;++i){
             sum=sum+a[i];
         }
         System.out.println("Missing Number is "+(totalSum-sum));
     }
}
