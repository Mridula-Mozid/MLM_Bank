package mlm_bank;

public class Donation extends MainMenu{
    public double DonationCalculation(double Amount) {
        CheckBalance = CheckBalance - Amount;
        return CheckBalance;
    }

    public void getDonate() {
        System.out.println("Your have: " + money.format(CheckBalance) + " in your account");

        System.out.println(" 1.BRAC\n" +
                " 2.ASA\n" +
                " 3.Caritas Bangladesh \n" +
                " 4.Care Bangladesh\n" +
                " 5.As-Sunnah Foundation\n" +
                " 6.JAAGO Foundation\n");
        System.out.println("Please Select where you want to donate money: ");
        int choice = sc.nextInt();

        System.out.println("Enter the Amount you want to pay:");
        double Amount = sc.nextDouble();

        if ((CheckBalance - Amount) >= 0) {
            DonationCalculation(Amount);
            {
                switch (choice) {
                    case 1:
                        miniStatement.add(Amount + " Taka has been donated." );
                        System.out.println("Successfully donated Tk. " + Amount + " to BRAC");
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
                        miniStatement.add(Amount + " Taka has been donated." );
                        System.out.println("Successfully donated Tk. " + Amount + " to ASA");
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
                        miniStatement.add(Amount + " Taka has been donated." );
                        System.out.println("Successfully donated Tk. " + Amount + " to Caritas Bangladesh");
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
                        miniStatement.add(Amount + " Taka has been donated." );
                        System.out.println("Successfully donated Tk. " + Amount + " to Care Bangladesh");
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
                        miniStatement.add(Amount + " Taka has been donated." );
                        System.out.println("Successfully donated Tk. " + Amount + " to As-Sunnah Foundation");
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
                    case 6:
                        miniStatement.add(Amount + " Taka has been donated." );
                        System.out.println("Successfully donated Tk. " + Amount + " to JAAGO Foundation");
                        System.out.println("Now your account balance is " + money.format(CheckBalance));
                        System.out.println("Do You want to go to the main menu?(Enter 1.Yes or 2.No)");
                        int option6 = sc.nextInt();
                        switch (option6) {
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
