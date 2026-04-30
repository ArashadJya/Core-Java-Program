 class test1 {
     public static void main(String[] args) {
         int a=13,b=0,c;
         try{
             c=a/b;
             System.out.println(c);
         }
         catch (Exception es){
                es.printStackTrace();
             System.out.println(es);
             System.out.println(es.getMessage());
         }

     }
}
