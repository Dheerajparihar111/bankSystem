import java.util.*;
class homepage{
    void homepage(){
        System.out.println("Enter Your Choice");
        System.out.println("1)Deposit  Money ");
        System.out.println("2)Withdraw Money");
    }
}
class  data{
   static String bankName;
   static String accountHolderName;
   static String accountType;
   static long accountNumber;
}
class Main extends data{
    static void main(String[] args) {
        System.out.println("**********Wel-Come To Bank *************");
        Scanner input = new Scanner(System.in);
        homepage Home = new homepage();
        Home.homepage();
        int choice = input.nextInt();
        switch (choice){
            case 1:
                System.out.println("Enter The Bank Name");
                input.nextLine();
                String bankName = input.nextLine();
                System.out.println("Enter Account Holder Name");
                accountHolderName = input.nextLine();
                System.out.println("Enter Account Type ");
                accountType = input.nextLine();
                System.out.println("Enter Account Number");
                 accountNumber = input.nextLong();
                System.out.println("Enter The Amount");
                int Amount = input.nextInt();
                System.out.println("Money Deposited Successfully");
                break;
            case 2:
                System.out.println("Enter Account Holder Name");
                input.nextLine();
                accountHolderName = input.nextLine();
                System.out.println("Enter Account Type ");
                accountType = input.nextLine();
                System.out.println("Enter Account Number");
                accountNumber = input.nextLong();
                System.out.println("Enter The Amount");
                int withdrawalAmount = input.nextInt();
                System.out.println("Money Withdraw Successfully");

        }
    }
}