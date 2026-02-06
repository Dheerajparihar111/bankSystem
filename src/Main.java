import java.util.*;
import java.time.*;
class homepage{
    void homepage(){
        System.out.println("========================");
        System.out.println("| Enter Your Choice    |");
        System.out.println("| 1)Deposit  Money     |");
        System.out.println("| 2)Withdraw Money     |");
        System.out.println("| 3)View Balance       |");
        System.out.println("| 4)Passbook Filling   |");
        System.out.println("| 5)EXIT               |");
        System.out.println("========================");
    }
}
class  data{
    int Amount;
   data(int Amount){
       this.Amount = Amount;
   }
}
class Main {
    static void main(String[] args) {
        System.out.println("**********Wel-Come To Bank *************");
        Scanner input = new Scanner(System.in);
        Date current = new Date();
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
                if (list.isEmpty()){
                    System.out.println("Out Of Balance");
                }else {
                    int balance = 0;
                    for (data d : list){
                        balance += d.Amount;
                    }
                    System.out.println("---------Balance--------");
                    System.out.println("Total Balance:$"+balance);
                }
                break;
            case 4:
                System.out.println("Enter Account Holder Name");
                input.nextLine();
                accountHolderName = input.nextLine();
                System.out.println("Enter Account Type ");
                accountType = input.nextLine();
                System.out.println("Enter Account Number");
                accountNumber = input.nextLong();
               if (list.isEmpty()){
                   System.out.println("No Entry ");
               }else {
                   int entrys = 0;
                   for (data d :list){
                       entrys += d.Amount;
                       System.out.println("Entry"+entrys);
                       System.out.println(current);
                   }


               }


            case 5:
                System.out.println("Thank You For Using Bank System");
                 System.exit(0);

        }
        }
    }
}