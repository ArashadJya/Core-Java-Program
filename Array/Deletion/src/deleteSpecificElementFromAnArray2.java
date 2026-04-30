public class deleteSpecificElementFromAnArray2 {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50};
        //by element
        // 30 number ko delete karna hai
        for (int i=0;i<arr.length;++i){
            if (arr[i]==30){
                for (int j=i;j<arr.length-1;++j){
                    arr[j]=arr[j+1];
                }
            }
        }
        for (int j=0;j<arr.length-1;++j){
            System.out.print(arr[j]+" ");
        }

    }
}
