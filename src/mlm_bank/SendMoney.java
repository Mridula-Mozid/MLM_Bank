package mlm_bank;

import java.util.Scanner;

public class SendMoney extends MainMenu {

    public double SendMoneyCalculation(double Amount) {
        CheckBalance = CheckBalance - Amount;
        return CheckBalance;
    }

    public void getSendMoney() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Your have: " + money.format(CheckBalance) + " in your account");
        System.out.println("Enter the Receiver's Mobile Number:");
        String receiverNumber = sc.next();
        System.out.println("Enter the Amount you want to send:");
        double Amount = sc.nextDouble();

        if ((CheckBalance - Amount) >= 0 && receiverNumber.length() == 11 && Amount > 0) {
            SendMoneyCalculation(Amount);

            System.out.println("Successfully sent Tk. " + Amount + " to " + receiverNumber);
            System.out.println("Now your account balance is " + money.format(CheckBalance));
            System.out.println("Do You want to go to the main menu?(Enter 1.Yes or 2.No)");
            int option = sc.nextInt();
            miniStatement.add(Amount + " Taka has been sent." );
            switch (option) {
                case 1:
                    getAccounts();
                    break;
                case 2:
                    System.out.println("Thank you for using MLM Bank.Have a nice day.");
                    break;
            }
        } else {
            System.out.println("Sorry,invalid input or you do not have enough balance in your account.Check again!");
            getAccounts();
        }
    }
}
