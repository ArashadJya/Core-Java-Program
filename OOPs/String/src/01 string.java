 class string {
    public static void main(String[] args) {
        char[] c={'a','r','a','s','h','a','d'};
        System.out.println(c);
//        char[] print karne par value isliye print hoti hai kyunki PrintStream class me println(char[]) naam ka overloaded method
//        available hai. Ye char array ko string ki tarah print karta hai. Baaki arrays ke liye aisa overloaded method nahi hota,
//        isliye unka reference print hota hai.
        String b=new String(c);

        System.out.println(b);

        System.out.println(b.charAt(5));
        //String ek immutable object hota hai usme value chamnge nahi hota hai


        c[0]='d';
        System.out.println(c);
        //char ek mutable object hota hai wo change ho sakta hai
    }
}
