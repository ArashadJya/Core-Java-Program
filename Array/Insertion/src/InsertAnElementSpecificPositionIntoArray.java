public class InsertAnElementSpecificPositionIntoArray {
    public static void main(String[] args) {
        int[] arr={10,20,30,50,60};
        int position=3;
        int element=40;

        int[] newarr=new int[arr.length+1];
        for (int i=0;i<position;++i){
            newarr[i]=arr[i];
        }

        newarr[position]=element;

        for (int i=position;i<arr.length;++i){
            newarr[i+1]=arr[i];
        }

        for (int i=0;i<newarr.length;++i){
            System.out.print(newarr[i]+" ");
        }
    }
}
