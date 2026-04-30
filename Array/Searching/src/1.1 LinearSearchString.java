import java.util.Scanner;
class LinearSearchString {
     public static void main(String[] args) {
         Scanner input=new Scanner(System.in);
         System.out.println("please enter the name who want to search in this List");
         String item=input.nextLine();
       String[]ar={"arashaad","arif","khan","jya","mohit","afzal","arif"};
       int temp=0;
       for (int i=0;i< ar.length;++i){
           if (ar[i].equals(item)){
               System.out.println("item present is at "+i+" index position");
               temp=temp+1;
               break;
           }
       }
       if (temp==0){
           System.out.println("item not present in this List");

       }
     }
}
