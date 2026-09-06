import java.util.Scanner;

class fibonacci{
    public static void main(String[] args) {
     // print a fibonacci series upto n terms
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a term");
        int num=sc.nextInt();

        int a=0;
        int b=1;
        System.out.print("0 ");
        System.out.print("1 ");
        for (int i=1;i<num-1;++i){
            int c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;

        }
    }
}
