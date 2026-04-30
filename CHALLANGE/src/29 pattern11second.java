 class pattern11second {
     public static void main(String[] args) {
         for (int i=1;i<=5;++i){
             for (int j=5;j>=i;--j){
                 if (j>=5){
                     System.out.print(" *");
                 }
                 else{
                     System.out.print("  ");
                 }
             }
             for (int k=4;k>=i;--k){
                 if (i>=1&&k>1){
                     System.out.print("  ");
                 }
                 else{
                     System.out.print(" *");
                 }
             }
             for (int l=1;l<=i;++l){
                 System.out.print("  ");
             }
             System.out.println();
         }
     }
}
