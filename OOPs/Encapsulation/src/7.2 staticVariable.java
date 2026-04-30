 class Employee1 {
    int empid;
    String name;
   static String company;
    Employee1(int empid,String name){
        this.empid=empid;
        this.name=name;
        company="jya tech";
        System.out.println(empid+" "+name+" "+company);
    }
     public static void main(String[] args) {
         Employee1 e1=new Employee1(101,"arashad");
         Employee1 e2=new Employee1(102,"khan");
         Employee1 e3=new Employee1(103,"arif");
     }
}
