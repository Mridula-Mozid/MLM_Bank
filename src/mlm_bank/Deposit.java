package mlm_bank;

import java.util.Scanner;

public class Deposit extends MainMenu {

    Scanner sc = new Scanner(System.in);

    public double DepositCalculation(double Amount) {
        CheckBalance = CheckBalance + Amount;
        return CheckBalance;
    }

    public void getDeposit() {

        System.out.println("Your have: " + money.format(CheckBalance) + " in your account");
        System.out.println("***You can not have more than 100000 Taka in one account***");

        System.out.println("Amount you want to Deposit(Max deposit 30k at a time):");

        double Amount = sc.nextDouble();

        if ((CheckBalance + Amount) >= 0 && (CheckBalance + Amount) <= 100000 && Amount > 0 && Amount <= 30000) {
            DepositCalculation(Amount);
            miniStatement.add(Amount + " Taka has been deposited." );
            System.out.println(Amount + " has been deposited to your account from MLM Deposit Point.");
            System.out.println("Now your account balance is " + money.format(CheckBalance));
            System.out.println("Do You want to go to the main menu?(Enter 1.Yes or 2.No)");
            int option = sc.nextInt();
            switch (option) {
                case 1:
                    getAccounts();

                    break;
                case 2:
                    System.out.println("Thank you for using MLM Bank.Have a nice day.");
                    break;
            }
        } else {
            System.out.println("Invalid input or you have exceeded the limit. Try again");
            getAccounts();
        }
    }
}
