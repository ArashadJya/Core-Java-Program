 class part3 {
     public static void main(String[] args) {

         String s1="Arashad";
         String s2="Java";
//         System.out.println("Concate method");
//         System.out.println(s1+s2);  //Arashad java
//         System.out.println(s1+10);  //Arashad10
//         System.out.println(s1+10+20); //Arashad1020
//         System.out.println(10+20+s1);  //30Arashad
           System.out.println(s1.concat(s2));

         System.out.println("Join method");
         System.out.println(String.join("-",s1,s2,s1));
//         //it is used to give to the specific symbol between each two string
//
         String s3="This is demo";
         System.out.println(s3.substring(3,9));  //s is d
         System.out.println(s3.substring(3));
         System.out.println(s3.substring(3,11));
     }
}
