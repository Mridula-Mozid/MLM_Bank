package mlm_bank;

public class MobileRecharge extends MainMenu {
    public double MobileRechargeCalculation(double Amount) {
        CheckBalance = CheckBalance - Amount;
        return CheckBalance;
    }

    public void getMobileRecharge() {
        System.out.println("Your have: " + money.format(CheckBalance) + " in your account");
        System.out.println("Enter the Merchant's Mobile Number:");
        String merchantNumber = sc.next();
        System.out.println("Enter the Amount you want to recharge:");
        double Amount = sc.nextDouble();

        if ((CheckBalance - Amount) >= 0 && merchantNumber.length() == 11 && Amount > 0) {
            MobileRechargeCalculation(Amount);
            miniStatement.add(Amount + " Taka has been recharged to" + merchantNumber );
            System.out.println("Successfully recharged Tk. " + Amount + " to " + merchantNumber);
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
            System.out.println("Sorry,invalid input or you do not have enough balance in your account.Check again!");
            getAccounts();
        }
    }
}
