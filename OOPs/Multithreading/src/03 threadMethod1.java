 class TEST1 {
    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println(Thread.currentThread().getName());  //main
        Thread.currentThread().setName("arashad");
        System.out.println(Thread.currentThread().getName()); //arashad
    }
    //getName() is used to get the name of the thread
     //setName() is used to set the name of the thread
}
