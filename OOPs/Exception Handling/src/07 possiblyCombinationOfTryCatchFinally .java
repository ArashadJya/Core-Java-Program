 class test3 {
     public static void main(String[] args) {
         try{

         }
         catch (RuntimeException e) {
             throw new RuntimeException(e);
         }
         catch (Exception e) {
             throw new RuntimeException(e);
         }
         finally {

         }
     }
}
