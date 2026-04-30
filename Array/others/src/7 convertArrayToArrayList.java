import java.util.ArrayList;

 class convertArrayToArrayList {
    public static void main(String[] args) {
        int[] a={10,20,30,40,50};
        ArrayList<Integer> list=new ArrayList<>();
        for (int i=0;i<a.length;++i){
            list.add(a[i]);
        }

        System.out.println(list);
    }
}
