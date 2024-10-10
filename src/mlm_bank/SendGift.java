package mlm_bank;

import java.util.Scanner;

public class SendGift extends MainMenu {
    public double SendGiftCalculation(double Amount) {
        CheckBalance = CheckBalance - Amount;
        return CheckBalance;
    }

    public void getSendGift() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Your have: " + money.format(CheckBalance) + " in your account");

        System.out.println("Enter the Amount you want to gift:");
        double Amount = sc.nextDouble();

        System.out.println("Enter the recepient's Mobile Number:");
        String receipientNumber = sc.next();

        System.out.println("Enter the Sender's name:");
        String senderName = sc.next();

        System.out.println("\tGift Options -");
        System.out.println("1.Happy Birthday");
        System.out.println("2.Eid Salami");
        System.out.println("3.Marriage Anniversary");
        System.out.println("4.Offerings");
        System.out.println("5.Customized");
        System.out.println("Enter your choice: ");
        int choice = sc.nextInt();

        if ((CheckBalance - Amount) >= 0 && receipientNumber.length() == 11 && (choice >= 1 && choice <= 5) && Amount > 0) {
            System.out.print("Enter a wish: ");

            {
                switch (choice) {
                    case 1:
                        System.out.println("Happy Birthday!");
                        SendGiftCalculation(Amount);
                        miniStatement.add(Amount + " Taka has been gifted." );
                        System.out.println("Successfully gifted Tk. " + Amount + " from " + senderName);
                        System.out.println("Now your account balance is " + money.format(CheckBalance));
                        System.out.println("Do You want to go to the main menu?(Enter 1.Yes or 2.No)");
                        int option1 = sc.nextInt();
                        switch (option1) {
                            case 1:
                                getAccounts();
                                break;
                            case 2:
                                System.out.println("Thank you for using MLM Bank.Have a nice day.");
                                break;
                        }
                        break;
                    case 2:
                        System.out.println("Eid Mubarak!");
                        SendGiftCalculation(Amount);
                        miniStatement.add(Amount + " Taka has been gifted." );
                        System.out.println("Successfully gifted Tk. " + Amount + " from " + senderName);
                        System.out.println("Now your account balance is " + money.format(CheckBalance));
                        System.out.println("Do You want to go to the main menu?(Enter 1.Yes or 2.No)");
                        int option2 = sc.nextInt();
                        switch (option2) {
                            case 1:
                                getAccounts();
                                break;
                            case 2:
                                System.out.println("Thank you for using MLM Bank.Have a nice day.");
                                break;
                        }
                        break;
                    case 3:
                        System.out.println("Happy Marriage Anniversary!");
                        SendGiftCalculation(Amount);
                        miniStatement.add(Amount + " Taka has been gifted." );
                        System.out.println("Successfully gifted Tk. " + Amount + " from " + senderName);
                        System.out.println("Now your account balance is " + money.format(CheckBalance));
                        System.out.println("Do You want to go to the main menu?(Enter 1.Yes or 2.No)");
                        int option3 = sc.nextInt();
                        switch (option3) {
                            case 1:
                                getAccounts();
                                break;
                            case 2:
                                System.out.println("Thank you for using MLM Bank.Have a nice day.");
                                break;
                        }
                        break;
                    case 4:
                        miniStatement.add(Amount + " Taka has been gifted." );
                        SendGiftCalculation(Amount);
                        System.out.println("Successfully gifted Tk. " + Amount + " from " + senderName);
                        System.out.println("Now your account balance is " + money.format(CheckBalance));
                        System.out.println("Do You want to go to the main menu?(Enter 1.Yes or 2.No)");
                        int option4 = sc.nextInt();
                        switch (option4) {
                            case 1:
                                getAccounts();
                                break;
                            case 2:
                                System.out.println("Thank you for using MLM Bank.Have a nice day.");
                                break;
                        }
                        break;
                    case 5:
                        String wish = sc.nextLine();
                        System.out.println(wish);
                        SendGiftCalculation(Amount);
                        miniStatement.add(Amount + " Taka has been gifted." );
                        System.out.println("Successfully gifted Tk. " + Amount + " from " + senderName);
                        System.out.println("Now your account balance is " + money.format(CheckBalance));
                        System.out.println("Do You want to go to the main menu?(Enter 1.Yes or 2.No)");
                        int option5 = sc.nextInt();
                        switch (option5) {
                            case 1:
                                getAccounts();
                                break;
                            case 2:
                                System.out.println("Thank you for using MLM Bank.Have a nice day.");
                                break;
                        }
                        break;
                    default:
                        System.out.println("Invalid");
                        getAccounts();
                }
            }
        } else {
            System.out.println("Sorry,invalid input or you do not have enough balance in your account.Check again!");
            getAccounts();
        }

    }
}
