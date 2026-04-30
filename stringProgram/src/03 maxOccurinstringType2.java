import java.util.Scanner;
class test {
     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println("Please enter a string");
         String s=sc.nextLine();
         int[] arr=new int[256];
         for (int i=0;i<s.length();++i){
             arr[s.charAt(i)]=arr[s.charAt(i)]+1;
         }
         int max=-1;
         char c=' ';
         for (int i=0;i<s.length();++i){
             if (max<arr[s.charAt(i)])
             {
                 max=arr[s.charAt(i)];
                 c=s.charAt(i);
             }
         }
         System.out.println("Maximum repeated is "+c);
     }
 }