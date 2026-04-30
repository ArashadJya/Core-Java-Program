import java.util.Scanner;

class reversString {
     public static void main(String[] args) {
         String temp=" ";
         System.out.println("Please enter a string");

         Scanner sc=new Scanner(System.in);
         String st=sc.nextLine();
         int a=st.length();
         for (int i=a-1;i>=0;--i){
             temp=temp+st.charAt(i);
         }
         System.out.println(temp);
     }
}
