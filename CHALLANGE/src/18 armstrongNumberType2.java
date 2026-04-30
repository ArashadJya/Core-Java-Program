 class armstrongNumberType2 {
     public static void main(String[] args) {
         int num=153;
         int t2=num;
         int t1=num;
         int length=0;
         int sum=0;
         while (t1!=0){
             t1=t1/10;
             length=length+1;
         }
         for (int i=1;i<=length;++i){
            int num1=num%10;
             sum=sum+(num1*num1*num1);
             num=num/10;
         }
         if (t2==sum){
             System.out.println("Armstrong Number");
         }
         else{
             System.out.println("Not Armstrong Number");
         }
     }
}
