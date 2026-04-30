public class anonymusArrayExample2 {
    public static void main(String[] args) {
     anonymusArrayExample2.sum(new int[][]{{10,20,30},{40,50}});
    }
    static void sum(int[][] no){
        int total=0;
        for (int ii[]:no){
            for (int i:ii){
                total=total+i;
            }
        }
        System.out.println("sum is "+total);
    }
}
