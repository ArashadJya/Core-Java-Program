 class pattern13 {
     public static void main(String[] args) {
         for (int i=1;i<=5;++i){
             for (int j=1;j<=5;++j){
                 if (1<i&i<5){
                     if (1<j&j<5){
                         System.out.print("  ");
                     }
                     else {
                         System.out.print(" *");
                     }
                 }
                 else{
                     System.out.print(" *");
                 }
             }
             System.out.println();
         }
     }
}
