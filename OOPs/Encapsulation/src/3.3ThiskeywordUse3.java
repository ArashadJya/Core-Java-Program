 class ThisDemo3 {
    ThisDemo3(){
        this(10);
        System.out.println("No arg constructer");
    }
    ThisDemo3(int a){
        System.out.println("Parameterised constructer");
    }

     public static void main(String[] args) {
         ThisDemo3 td=new ThisDemo3();
     }
}
//USE 3
 //This keyword can be used to invoke one  constructer in other constructer in the same class
 //means ek class ke andar agar ek se adhik constructer hai to ham ek constructer ko ham dusre  constructer ke andar invoke kar sakte hai
 // jisse hamko ek hi constructer ka object banana padega aur dono constructer ki value print ho jayegi.
