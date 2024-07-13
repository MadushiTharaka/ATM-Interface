import java.util.Scanner;

class BankAccount 
{
    double balance;

    public BankAccount(double InitialBal) 
    {
        this.balance = InitialBal;
    }

    public double getBalance() 
    {
        return balance;
    }

    public void deposit(double amount) 
    {
        if (amount > 0) 
        {
            balance = balance + amount;
            System.out.println("Successfully Deposit!! Your Current balance is : Rs." + balance);
        }

        else 
        {
            System.out.println("Invalid!!!");
        }
    }

    public void withdraw(double amount)
    {
        if (amount <= balance) 
        {
            balance = balance - amount;
            System.out.println("Successfully Withdrawal!! Your Current balance is : Rs." + balance);
        }
        else 
        {
            System.out.println("Invalid!!!");
        }
    }
}

class ATM 
{
    private BankAccount account;

    public ATM(BankAccount account) 
    {
        this.account = account;
    }

    public void Interface()
    {
        Scanner sc = new Scanner(System.in);
        double amount;
        char again;

        do
        {
            System.out.println("\n Welcome ATM Interface ");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");

            System.out.print("Enter the you want to Choose an option: ");
            int choice = sc.nextInt();

            System.out.println();

            switch(choice)
            {
                case 1:
                System.out.println("Your Acc balance is : Rs." + account.getBalance());
                break;
                
                case 2:
                System.out.println("Enter the deposit amount : Rs.");
                amount=sc.nextDouble();
                account.deposit(amount);
                break;

                case 3:
                System.out.println("Enter the withdrawal amount : Rs.");
                amount=sc.nextDouble();
                account.withdraw(amount);
                break;

                case 4:
                System.exit(0);

                default:
                System.out.println("Invalid choice!!");

            }

            System.out.println();
            System.out.println("Do you want run this program again ?");
            again = sc.next().charAt(0);
        }

        while(again == 'Y' || again == 'y');
        {
            System.out.println();
            System.out.println("Thank You!! Have a nice day");
        }
    }
}

public class ATMInterface
{
    public static void main(String[] args) 
    {
        BankAccount obj1 = new BankAccount(65000); 
        ATM obj2 = new ATM(obj1);
        
        obj2.Interface();

    }
}
