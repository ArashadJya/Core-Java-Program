import java.util.ArrayList;

class findOddAndEvenIntegerInArray {
     public static void main(String[] args) {
         int[] a={1,2,3,4,5,6,7,8,9};
         ArrayList<Integer> ar1=new ArrayList<>();
         ArrayList<Integer> ar2=new ArrayList<>();
         for ( int i=0;i<a.length;++i){
             if (a[i]%2==0){
                 ar1.add(a[i]);
             }
             else{
                 ar2.add(a[i]);
             }
         }
         System.out.print("Even number is ");
         int sum=0;
         for (int no:ar1){
             System.out.print(no+" ");
             sum=sum+no;
         }
         System.out.println();
             System.out.println("Number of Even is "+ar1.size());
         System.out.println("Sum of even number is "+sum);
         System.out.print("Odd Number is ");
             int sum2=0;
         for ( int no:ar2){
             System.out.print(no+" ");
             sum2=sum2+no;
         }
         System.out.println();
             System.out.println("Number of odd is "+ar2.size());
         System.out.println("Sum of odd number is "+sum2);
     }
}
