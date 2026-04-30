class Employee {
    String name;
    int age;
    Employee(String name,int age){
        this.name=name;
        this.age=age;
        System.out.println(name+" "+age);
    }

    public static void main(String[] args) {
        Employee e1=new Employee("arashad",22);
        Employee e2=new Employee("jya",34);


    }
}
