 class methodOverloading {
    void show(){
        System.out.println("1");
    }
    void show(int a){
        System.out.println("2");
    }

     public static void main(String[] args) {
         methodOverloading t=new methodOverloading();
         t.show(2);
         t.show();
     }
}
