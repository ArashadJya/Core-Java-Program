import java.util.ArrayList;

class convertArrayListToArray {
     public static void main(String[] args) {
         ArrayList<Integer> list=new ArrayList<>();
         list.add(10);
         list.add(30);
         list.add(30);
         list.add(45);

         int[] arr=new int[list.size()];
         for (int i=0;i<list.size();++i){
             arr[i]=list.get(i);
         }

         for (int i=0;i<arr.length;++i){
             System.out.print(arr[i]+" ");
         }
     }
}
