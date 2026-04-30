public class deleteDuplicateElement {
    public static void main(String[] args) {
        int[] arr={10,10,20,30,40,40,40};
        int[] temp=new int[arr.length];
        int j=0;
        for (int i=0;i<arr.length-1;++i){

            if(arr[i]!=arr[i+1]){
                temp[j]=arr[i];
                ++j;
            }
        }
        temp[j]=arr[arr.length-1];
        for ( j=0;j<temp.length;++j){
            System.out.print(temp[j]+" ");
        }
    }
}
