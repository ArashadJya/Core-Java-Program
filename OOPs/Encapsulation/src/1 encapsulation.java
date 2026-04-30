 class employee {
   private int empid;

     public void setEmpid(int empid1) {
         empid=empid1;
     }
     public int getEmpid(){
         return empid;
     }
 }
class company{
    public static void main(String[] args) {
        employee e=new employee();
        e.setEmpid(10);
        System.out.println(e.getEmpid());
    }
}
