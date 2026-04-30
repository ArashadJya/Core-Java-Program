 class divideStringIntoTwoEqualParts {
     public static void main(String[] args) {
         String s="arashd";
         if (s.length()%2!=0){
             System.out.println("String can not be divide into two parts because string is not even");
         }
         else{
             int mid=s.length()/2;
             String part1=s.substring(0,mid);
             String part2=s.substring(mid);

             System.out.println("First Part "+part1);
             System.out.println("Second Part "+part2);
         }
     }
}
