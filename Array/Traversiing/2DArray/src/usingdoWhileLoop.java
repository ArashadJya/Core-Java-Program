public class usingdoWhileLoop {
    public static void main(String[] args) {
        int[][] a={{10,20,30,40},{50,60},{70,80,90}};
        int i=0;
        do{
            int j=0;
            do{
                System.out.print(a[i][j]+" ");
                ++j;
            }while (j<a[i].length);
            ++i;
            System.out.println();
        }while(i<a.length);
    }
}
