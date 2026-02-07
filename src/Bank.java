import java.util.Scanner;

public class Bank {
    Scanner sc = new Scanner(System.in);
    Account account;

    public void createAccount() {
        System.out.print("Enter Account Number: ");
        long accNo = sc.nextLong();
        sc.nextLine();

        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();

        account = new Account(accNo, name);
        System.out.println("Account created successfully!");
    }

    public void depositMoney() {
        if (account != null) {
            System.out.print("Enter amount to deposit: ");
            double amount = sc.nextDouble();
            account.deposit(amount);
        } else {
            System.out.println("No account found. Please create an account first.");
        }
    }

    public void withdrawMoney() {
        if (account != null) {
            System.out.print("Enter amount to withdraw: ");
            double amount = sc.nextDouble();
            account.withdraw(amount);
        } else {
            System.out.println("No account found. Please create an account first.");
        }
    }

    public void checkBalance() {
        if (account != null) {
            account.displayAccount();
        } else {
            System.out.println("No account found.");
        }
    }
}
