 class string {
    public static void main(String[] args) {
        char[] c={'a','r','a','s','h','a','d'};
        String b=new String(c);

        System.out.println(b);

        System.out.println(b.charAt(5));
        //String ek immutable object hota hai usme value chamnge nahi hota hai


        c[0]='d';
        System.out.println(c);
        //char ek mutable object hota hai wo change ho sakta hai
    }
}
