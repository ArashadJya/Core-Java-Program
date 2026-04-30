import java.util.Scanner;

 class armstrongNumbersType3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a number");
        int num=sc.nextInt();
        int num1=num;
        int sum=0;
        while(num>0){
            int digit=num%10;
            sum=sum+(digit*digit*digit);
            num=num/10;
        }
        if (num1==sum){
            System.out.println("This is armstrong number");
        }
        else{
            System.out.println("This is not armstrong number");
        }


    }
}
