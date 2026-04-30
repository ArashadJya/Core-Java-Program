public class usingdoWhileLoop {
    public static void main(String[] args) {
        int[][][] a={{{10,20,30,40},{50,60},{70,80,90}}};
        System.out.println(a[0][0][3]);
        int i=0;
        do {
            int j=0;
            do {
                int k=0;
                do {
                    System.out.print(a[i][j][k]+" ");
                    k++;
                }while (k<a[i][j].length);
                j++;
                System.out.println();
            }while (j<a[i].length);
            i++;
        }while (i<a.length);

    }
}
