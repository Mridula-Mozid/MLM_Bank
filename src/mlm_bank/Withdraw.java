package mlm_bank;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class Withdraw extends MainMenu {
    public double WithdrawCalculation(double Amount) {
        CheckBalance = CheckBalance - Amount;
        return CheckBalance;
    }

    public void getWithdraw() {
        Scanner sc = new Scanner(System.in);
        System.out.println("You have : " + money.format(CheckBalance) + " in your account");
        System.out.println("Enter the amount you want to withdraw:");
        double Amount = sc.nextDouble();

        if ((CheckBalance - Amount) >= 0 && Amount > 0) {
            WithdrawCalculation(Amount);
            System.out.println("Tk." + Amount + "  has been withdrawn from you account");
            System.out.println("Now your Account Balance is : " + money.format(CheckBalance));
            System.out.println("Do You want to go to the main menu?(Enter 1.Yes or 2.No)");
            int option = sc.nextInt();
            miniStatement.add(Amount + " Taka has been withdrawn." );
            switch (option) {
                case 1:
                    getAccounts();
                    break;
                case 2:
                    System.out.println("Thank you for using MLM Bank.Have a nice day.");
                    break;
            }
        } else {
            System.out.println("Sorry, invalid input or you do not have enough balance in your account.Check again!");
            getAccounts();
        }
    }
}
