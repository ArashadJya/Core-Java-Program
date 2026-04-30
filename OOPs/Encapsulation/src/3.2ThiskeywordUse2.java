//USE 2
//This keyword can be used to invoke current class method
//iska matalab ek hi class ke andar agar do method hai to pahle wale method ko ham dusre wale method ke andar invoke kara sakte hai
// aur us class ka object bana ke ham second wale method ko call kara denge to pahle wala method bhi vcall ho jayega
 class ThisDemo2 {
    void display(){
        System.out.println("Display name method");
    }
    void show(){
        System.out.println("Show name method");
       this.display();
    }
    public static void main(String[] args) {
        ThisDemo2  td =new ThisDemo2();
        td.show();
    }
}
