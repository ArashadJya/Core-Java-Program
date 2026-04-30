public class mergingTwoArrayInOneArray {
    public static void main(String[] args) {
        int[] a={10,20,30,40,50};
        int [] b={60,70,80,90,1,2,3,4,5,6,7,8,9};

        int j=0,k=0;
        int[] newarr=new int[a.length+b.length];
        for (int i=0;i<newarr.length;++i){
            if (i<a.length){
              newarr[i]=a[j++];
            }
            else{
                newarr[i]=b[k++];

            }
        }
        for (int i=0;i<newarr.length;++i){
            System.out.print(newarr[i]+" ");
        }
    }
}
