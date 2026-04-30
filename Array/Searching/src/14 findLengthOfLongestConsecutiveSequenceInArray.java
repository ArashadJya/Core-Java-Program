import java.util.Arrays;

class findLengthOfLongestConsecutiveSequenceInArray {
     public static void main(String[] args) {
          int[] arr={6,5,4,2,1,8,7,11,13,14,15,12,16,17};
          Arrays.sort(arr);
          int currentLength=1;
          int maxLength=1;
          for (int i=1;i<arr.length;++i){
               if(arr[i]==arr[i-1]+1){
                    currentLength++;
               }
               else{
                    currentLength=1;
               }

          }
          System.out.println(currentLength);
          
         
     }
}
