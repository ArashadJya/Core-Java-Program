public class deleteSpecififcElementFromAnArray {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50};
//by indexing position
        int element=30;
        int position=2;

        int[] newarre=new int[arr.length-1];

        for (int i=0;i<position;++i){
            newarre[i]=arr[i];
        }
        for (int i=position+1;i<arr.length;++i){
            newarre[i-1]=arr[i];
        }

        for (int i=0;i<newarre.length;++i){
            System.out.print(newarre[i]+" ");
        }

    }
}
