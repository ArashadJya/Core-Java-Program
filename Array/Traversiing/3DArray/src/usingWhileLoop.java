public class usingWhileLoop {
    public static void main(String[] args) {
        int[][][] a={{{10,20,30,40},{50,60},{70,80,90}}};
        int i=0;
        while (i<a.length){
            int j=0;
            while (j<a[i].length){
                int k=0;
                while (k<a[i][j].length){
                    System.out.print(a[i][j][k]+" ");
                    k++;
                }
                System.out.println();
                j++;
            }
            i++;
        }
    }
}
