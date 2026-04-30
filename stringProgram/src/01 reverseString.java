import java.util.Scanner;
class reverseString {
    public static void main(String[] args) {
        System.out.println("Please enter a words");
        Scanner sc=new Scanner(System.in);
        String letter=sc.nextLine();
        int name=letter.length();
        for (int i=name-1;i>=0;--i){
            System.out.print(letter.charAt(i));
        }
    }

}
