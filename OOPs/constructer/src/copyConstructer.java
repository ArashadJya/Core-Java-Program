 class strudent {
    String name;
    int roll;
    strudent(String name,int roll){
        this.name=name;
        this.roll=roll;
    }
    strudent(strudent original){
        this.name=original.name;
        this.roll= original.roll;
    }
    void display(){
        System.out.println("name "+name+" roll no."+roll);
    }

     public static void main(String[] args) {
         strudent s1=new strudent("Arashad",20);
         strudent s2=new strudent(s1);
         System.out.println("parameterised constructer ");
         s1.display();
         System.out.println("copy constructer ");
         s2.display();

         System.out.println("After modifying the copy constructer");
         s2.name="Arif";
         s2.roll=12;
         s2.display();
     }
}
