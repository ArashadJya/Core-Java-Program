 class pattern10 {
     public static void main(String[] args) {
         //pattern1
//         for (int i=1;i<=5;++i){
//             for (int j=1;j<=5;++j){
//
//                 // Other method
////                 if (i>=2&&j<=i-1){
////                     System.out.print("  ");
////                 }
////                 else{
////                     System.out.print(" *");
////                 }
//
//
////                 Other method
//                 if(i==j){
//                     System.out.print(" *");
//                 }
//                 else{
//                     System.out.print("  ");
//                 }
//             }
//             System.out.println();
//         }
         //pattern2
         System.out.println();
         System.out.println();
         for (int i=1;i<=5;++i){
             for (int j=4;j>=i;--j){
                 System.out.print("  ");
             }
             for (int k=1;k<=i;++k){
                 if (i>=2&&k>1){
                     System.out.print("  ");
                 }
                 else {
                     System.out.print(" *");
                 }
             }
         System.out.println();
         }
     }

}
