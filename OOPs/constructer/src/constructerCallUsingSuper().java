class engineer {
    engineer(String name){
        System.out.println("Name "+name);
    }
}
 class salary extends engineer{
    salary(String name,int age){
        super("arif");
        System.out.println("Name "+name+"   salary  "+age);
    }
    public static void main(String[] args) {
        salary s=new salary("Arashad",54645);
    }
}
//in the case of constructer super() is used to invoke the parrent class coinstructer in the sub class constructer
