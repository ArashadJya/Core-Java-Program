 class counterDemo {
  static   int count=0;
     counterDemo(){
        count++;
        System.out.println(count);
    }
    public static void main(String[] args) {
        counterDemo c1=new counterDemo();
        counterDemo c2=new counterDemo();
        counterDemo c3=new counterDemo();
    }
}
