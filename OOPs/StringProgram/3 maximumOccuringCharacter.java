 class maximumOccuringCharacter {
     public static void main(String[] args) {
         String a="arashsasds";
         int maxValue=Integer.MIN_VALUE;
         char ch=a.charAt(0);
         for (int i=0;i<a.length();++i){
             int currentLength=1;
             for (int j=i+1;j<a.length();++j){
                 if (a.charAt(i)==a.charAt(j)){
                     currentLength++;
                 }
             }
             if(currentLength>maxValue){
                 maxValue=currentLength;
                 ch=a.charAt(i);
             }
         }
         System.out.println("Maximum occuring character is "+ch);
     }
}
