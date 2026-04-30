import java.util.Scanner;

class insufficientBalence  extends Exception{
    insufficientBalence(String msg){
        super(msg);
    }
}
class BankAccount{
      double balance;
    public BankAccount(double balance){
        this.balance=balance;
    }
      void withraw(double amount) throws insufficientBalence{
        if(amount>balance){
            throw new insufficientBalence("insufficient balance");
        }
        else{
            balance=balance-amount;
            System.out.println("withraw sucessful.Remaining Balence  "+balance);
        }
    }
}
class main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the money how much money want to deposit");
        double deposit=sc.nextDouble();
        double balance=deposit;
        try{
            System.out.println("Enter the money you want to credit");
            BankAccount account=new BankAccount(balance);
            double amount=sc.nextDouble();
            account.withraw(amount);

            throw new  insufficientBalence("Nice to meet you apse milkar achha laga");
        } catch (insufficientBalence e) {
            System.out.println(e.getMessage());
        }
    }
}
