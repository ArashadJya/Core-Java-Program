import java.util.Scanner;
class reverseString {
    public static void main(String[] args) {
        System.out.println("Please enter a words");
        Scanner sc=new Scanner(System.in);
        String letter=sc.nextLine();
        int name=letter.length();
        String rev="";
        for (int i=name-1;i>=0;--i){
         rev=rev+letter.charAt(i);
        }
        System.out.println(rev);
    }

}
