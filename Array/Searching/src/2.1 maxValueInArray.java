 class maxValueInArray {
     public static void main(String[] args) {
         int[] a={12,34,54,67,98,65,45,35,3,8,4,4,899,};

         //First Method
//        for(int i=0;i<a.length;++i){
//            for (int j=i+1;j<a.length;++j){
//                if(a[i]<a[j]){
//                    int temp=a[i];
//                    a[i]=a[j];
//                    a[j]=temp;
//
//                }
//            }
//            System.out.println(a[i]);
//            break;
//        }

//         Second Method
         int max=a[0];
         for (int i=1;i<a.length;++i){
             if (a[i]>max){
                 max=a[i];
             }
         }
         System.out.println(max);
     }
}
