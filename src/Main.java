import java.util.*;
class homepage{
    void homepage(){
        System.out.println("Enter Your Choice");
        System.out.println("1)Deposit  Money ");
        System.out.println("2)Withdraw Money");
        System.out.println("3)View Balance");
    }
}
class  data{
   //static String bankName;
   //static String accountHolderName;
   //static String accountType;
   //static long accountNumber;
   int Amount;
   data(int amount){
       this.Amount =Amount;

   }
}
class Main {
    static void main(String[] args) {
        System.out.println("**********Wel-Come To Bank *************");
        Scanner input = new Scanner(System.in);
        ArrayList <data> list = new ArrayList<>();
        homepage Home = new homepage();
        while (true){
        Home.homepage();
        int choice = input.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter The Bank Name");
                input.nextLine();
                String bankName = input.nextLine();
                System.out.println("Enter Account Holder Name");
                String accountHolderName = input.nextLine();
                System.out.println("Enter Account Type ");
                String accountType = input.nextLine();
                System.out.println("Enter Account Number");
                Long accountNumber = input.nextLong();
                System.out.println("Enter The Amount");
                int Amount = input.nextInt();
                list.add(new data(Amount));
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
                int total = 0;
                for (data d : list) {
                    total += d.Amount;
                }
                if (withdrawalAmount <= total) {
                    total -= withdrawalAmount;
                    list.clear();
                    list.add(new data(total));
                    System.out.println("Money Withdraw Successfully");
                } else {
                    System.out.println("Out off Balance");
                }
                break;
            case 3:
                 System.exit(0);
           }
        }
    }
}