import java.util.Scanner;

class Factorials {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the calculating factorial");
        System.out.println("Please enter a number");
        int num = input.nextInt();
        int fact = 1;
        for (int i = 1; i <= num; ++i) {
            fact = fact * i;
        }
        System.out.println("Factorial of " + num + "=" + fact);

    }
}