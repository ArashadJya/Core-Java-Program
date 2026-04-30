 class animal {
    public void eat(){
        System.out.println("I am eating");
    }

     public static void main(String[] args) {
         System.out.println("1");
         animal buz=new animal();
         buz.eat();
         buz.run();
         Birds sp=new Birds();
         sp.fly();
     }
     public void run(){
         System.out.println("I am running");
     }
}
class Birds{
    public void fly(){
        System.out.println("I am flying");

    }
}
//ham ek class ke method ko ham dusre class ke main method ke andar call kar sakte hai us class ka object banake