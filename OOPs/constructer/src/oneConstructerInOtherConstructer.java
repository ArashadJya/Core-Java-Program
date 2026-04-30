 class student {
    String name;
    int salary;
    student(String name,int salary){
        System.out.println("Parameterised constructer");
        this.name=name;
        this.salary=salary;
    }
    student(){
       this("Arashad",20000);
        System.out.println("kdv kdj");
        System.out.println("Default constructer");
    }
    void display(){
        System.out.println(name+" "+salary);
    }

     public static void main(String[] args) {
         student t=new student();
         t.display();
     }
}
//in the case of constructer this() is used to invoke the one constructer in other constructer within same class
// but parameters not should be same