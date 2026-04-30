 class minimumOccuringCharacter {
     public static void main(String[] args) {
         String str="aabbccddffegg";
         char minchar=' ';
         int min=str.length();
         for (int i=0;i<str.length();++i){
             int count=1;
             for (int j=0;j<str.length();++j){
                 if(str.charAt(i)==str.charAt(j)){
                     count++;
                 }
             }
             if(count<min){
                 min=count;
                 minchar=  str.charAt(i);

             }
         }
         System.out.println("Minimum occuring character is "+minchar);
     }
}
