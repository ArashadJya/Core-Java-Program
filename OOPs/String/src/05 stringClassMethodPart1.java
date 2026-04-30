 class part1 {
     public static void main(String[] args) {
         String name="Arashad";

         String email="jyaarashad@gmail.com";
         String pass="asc123";
//         System.out.println(" method 1: using length() check String is empty or not  ");
//         int i=names.length();
//         if (i==0){
//             System.out.println("Length is empty");
//         }
//         else {
//             System.out.println("Length is not empty");
//         }
//         System.out.println("method 2: using isEmpty() check string is Empty or not");
//         boolean b=name.isEmpty();
//         if (b==true){
//             System.out.println("Name is empty");
//         }
//         else{
//             System.out.println("Name is not empty");
//         }
         System.out.println("method 3:  using trim() check String is empty or not");
         String names="     abc      ";
         System.out.println(names.trim());
          String names1="   abc     def    ";
         System.out.println(names1.trim());
         String name2="   ";
          int c=name2.trim().length();
          if (c==0){
              System.out.println("name2 is empty");
          }
          else{
              System.out.println("name2 is not empty");
          }
     }
}
