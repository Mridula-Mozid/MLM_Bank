package mlm_bank;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MainMenu extends MiniStatement {


    public static double CheckBalance;

    public static DecimalFormat money = new DecimalFormat("'$'###,##0.00");
    Scanner sc = new Scanner(System.in);
    public void getAccounts() {

        System.out.println("Welcome to main menu");
        System.out.println("""
                 These are the options -
                 1. My Account
                 2. Deposit Money
                 3. Withdraw Money
                 4. Send Money
                 5. Mobile Recharge
                 6. Send Gift
                 7. Donate
                 8. Mini Statement
                 9. Change Password
                10. Exit menu"""); //StringLiteral

        System.out.println("Enter Your Option: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                MyAccount myAccount = new MyAccount();
                myAccount.getMyAccount();
                break;
            case 2:
                Deposit deposit = new Deposit();
                deposit.getDeposit();
                break;
            case 3:
                Withdraw withdraw = new Withdraw();
                withdraw.getWithdraw();
                break;
            case 4:
                SendMoney sendMoney = new SendMoney();
                sendMoney.getSendMoney();
                break;
            case 5:
                MobileRecharge mobileRecharge = new MobileRecharge();
                mobileRecharge.getMobileRecharge();

                break;

            case 6:
                SendGift sendGift = new SendGift();
                sendGift.getSendGift();
                break;
            case 7:
                Donation donation = new Donation();
                donation.getDonate();

                break;
            case 8:
                super.viewMiniStatement();
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
                break;
            case 9:
                EntryOptions entryOptions =  new EntryOptions();
                entryOptions.changePassword();
                getAccounts();
                break;
            case 10:
                System.out.println("Thank you for using MLM Bank.Have a nice day.");
                break;

            default:
                System.out.println("Invalid Option.Try again!");
                getAccounts();
        }
    }
    public double getCheckBalance() {
        return CheckBalance;
    }
}