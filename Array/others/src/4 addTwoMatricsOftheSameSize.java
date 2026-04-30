 class addTwoMatricsOftheSameSize {
     public static void main(String[] args) {
         int[][] a={{10,20,30},{30,20,10}};
         int[][] b={{40,50,60},{20,30,40}};

         int [][] result=new int[2][3];
         for (int i=0;i<a.length;++i){
             for (int j=0;j<a[i].length;++j){
                 result[i][j]=a[i][j]+b[i][j];
             }
         }
         for (int i=0;i< result.length;++i){
             for (int j=0;j<result[i].length;++j){
                 System.out.print(result[i][j]+" ");

             }
             System.out.println();
         }

     }
}
