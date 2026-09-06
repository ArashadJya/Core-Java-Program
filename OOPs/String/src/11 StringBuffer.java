 class stringbufferdemo {
     public static void main(String[] args) {
         //String constructer
         StringBuffer sb=new StringBuffer();
         System.out.println(sb.capacity());
         //sb.capicity batata hai ki uske andar kitne character store ho sakte hai
         StringBuffer sb1=new StringBuffer("Arashad");
         System.out.println(sb1.capacity());     //capicity 16+7   because capicity() have a by default already 16

         StringBuffer sb2=new StringBuffer(1000); //agar hame pata hai ki stringbuffer ke andar ek specific digits tak number aa sakte hai to ham buffer ke andar de sakte hai
         System.out.println(sb2.capacity());

         System.out.println("Method");
         StringBuffer sb3=new StringBuffer("Hello Arashad");
         System.out.println(sb3.append("hi"));//append() method is use to add new string after the old string
         System.out.println(sb3);
         System.out.println(sb3.charAt(3));
         System.out.println(sb3.delete(2,5));
         System.out.println(sb3.deleteCharAt(3));
         System.out.println(sb3.insert(3,"asd"));
         System.out.println(sb3.replace(3,6,"hsdf"));
         System.out.println(sb3.subSequence(3,6));
         System.out.println(sb3.substring(3,9));
         sb3.setCharAt(4,'c');
         System.out.println(sb3);
     }
}
